package cn.blackshop.search.util;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.druid.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.action.admin.indices.alias.IndicesAliasesRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexResponse;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.Map;

@Slf4j
//@Scope("singleton")
@Service
public class ElasticSearchUtil {
	
	private static  Log logger=LogFactory.getLog(ElasticSearchUtil.class);
	@Value("${elasticsearch.retry-on-conflict}")
	private  Integer retryOnConflict; //出现冲突时重试次数

	@Value("${elasticsearch.number-of-shards}")
	private  Integer number_of_shards;//分片数

	@Value("${elasticsearch.number-of-replicas}")
	private  Integer number_of_replicas; //备份数
	/**
	 * elk集群地址
	 */
	@Value("${elasticsearch.ip}")
	private String host;
	/**
	 * 端口
	 */
	@Value("${elasticsearch.port}")
	private Integer port;
	/**
	 * 集群名称
	 */
	@Value("${elasticsearch.cluster.name}")
	private String clusterName;

	/**
	 * 集群节点
	 */
	@Value("${elasticsearch.cluster.node}")
	private String clusterNode;

	/**
	 * 连接池
	 */
	@Value("${elasticsearch.pool}")
	private String poolSize;


	private TransportClient client = null;
	public TransportClient getTransportClient() {
		if (client == null) {
			synchronized (TransportClient.class) {
				if (client == null) {
					try{
						client = initClient();
					}catch(Exception ex){}
				}
			}
		}
		return client;
	}
	/**
	 * 初始化client
	 * @return
	 * @throws Exception
	 */
	public TransportClient initClient()throws Exception{
		Settings settings = Settings.builder().put("cluster.name", clusterName).build();
		@SuppressWarnings("resource")
        TransportClient client = new PreBuiltTransportClient(settings)
				.addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
		return client;
	}
	public Settings getIndexSettings(){
		Settings indexSettings = Settings.builder()
                .put("number_of_shards", number_of_shards)
                .put("number_of_replicas", number_of_replicas)
                .build();
		return indexSettings;
	}

	/**
	 * 创建索引。
	 * @param indexName	索引名
	 * @param indexType	类型
	 * @param aliasName	别名
	 * @param builder   mapping
	 * @return
	 */
	public Boolean createIndex(String indexName, String indexType, String aliasName, XContentBuilder builder){
		CreateIndexResponse response = null;
		TransportClient client = getTransportClient();
		//创建索引
        if(!isIndexExists(indexName)){
        	CreateIndexRequest indexRequest = new CreateIndexRequest(indexName, getIndexSettings());
        	response = client.admin().indices().create(indexRequest).actionGet();
        	if(response.isAcknowledged()){
        		//创建别名
        		if(!StringUtils.isEmpty(aliasName)){
					IndicesAliasesRequest request = new IndicesAliasesRequest();
					IndicesAliasesRequest.AliasActions aliasAction =  new IndicesAliasesRequest.AliasActions(IndicesAliasesRequest.AliasActions.Type.ADD).index(indexName)
							.alias(aliasName);
					request.addAliasAction(aliasAction);
					client.admin().indices().aliases(request).actionGet();
				}
				//创建mapping
				PutMappingRequest mapping = Requests.putMappingRequest(indexName)
						.type(indexType).source(builder);
				client.admin().indices().putMapping(mapping).actionGet();
			}
        	return response.isAcknowledged();
        }
        return Boolean.FALSE;
	}
	/**
	 * 把数据索引进es。
	 * @param indexName  索引名
	 * @param indexType  索引类型
	 * @param object  数据对象
	 * @param id    数据id
	 * @throws Exception
	 */
	public  void createIndex(String indexName, String indexType, Object object, Long id)throws Exception{
		TransportClient client = getTransportClient();
		String json = JSONUtils.toJSONString(object);
		client.prepareIndex(indexName, indexType, String.valueOf(id)).setSource(json, XContentType.JSON).get();
	}
	
	/**
	 * 删除整个索引
	 * @param indexName
	 * @return Boolean true 成功，false 失败
	 */
	public Boolean deleteIndex(String indexName) {
        if (isIndexExists(indexName)) {
			TransportClient client = getTransportClient();
        	DeleteIndexResponse deleteIndexResponse = client.admin().indices().delete(new DeleteIndexRequest(indexName)).actionGet();
        	return deleteIndexResponse.isAcknowledged();
        }
        return false;
    }
	
	public Boolean deleteIndexById(String indexName, String indexType, String id){
		TransportClient client = getTransportClient();
		DeleteResponse dResponse = client.prepareDelete(indexName, indexType, id).execute().actionGet();
		return dResponse.forcedRefresh();
	}
	
	/**
	 * 判断索引是否存在
	 * @param indexName
	 * @return
	 */
	public Boolean isIndexExists(String indexName) {
        try {
			TransportClient client = getTransportClient();
        	IndicesExistsResponse indicesExistsResponse = client.admin().indices()
            		.exists(new IndicesExistsRequest(new String[] { indexName })).actionGet();
                return indicesExistsResponse.isExists();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
	/**
	 * 更新文档，如果文档不存在则创建新的索引
	 * @param indexName
	 * @param indexType
	 * @param object
	 * @param id
	 */
	public Integer updateIndex(String indexName, String indexType, Object object, String id) throws Exception{
		try{
			TransportClient client = getTransportClient();
			String json = JSONUtils.toJSONString(object);
			IndexRequest indexRequest = new IndexRequest(indexName, indexType, id).source(json, XContentType.JSON);
	        UpdateRequest uRequest = new UpdateRequest(indexName, indexType, id).doc(json, XContentType.JSON).retryOnConflict(retryOnConflict).upsert(indexRequest);
			UpdateResponse response = client.update(uRequest).get();
			return response.status().getStatus();
		}catch(Exception ex){
			logger.error("更新索引数据出错,indexName["+indexName+"],indexType["+indexType+"],docId["+id+"]",ex);
			throw new Exception(ex);
		}
		
	}
	
	/**
	 * 更新局部字段
	 * @param indexName
	 * @param indexType
	 * @param map
	 * @param id
	 */
	public void updateField(String indexName, String indexType, Map map, String id){
		try{
			TransportClient client = getTransportClient();
			UpdateRequest updateRequest = new UpdateRequest(indexName, indexType, id);
			updateRequest.doc(map).retryOnConflict(retryOnConflict);
	        client.update(updateRequest).get();
		}catch(Exception ex){
			logger.error("更新局部字段数据出错：",ex);
		}
	}
}
