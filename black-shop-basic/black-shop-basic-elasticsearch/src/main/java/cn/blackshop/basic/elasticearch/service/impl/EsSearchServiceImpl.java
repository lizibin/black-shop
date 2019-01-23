/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.elasticearch.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import com.alibaba.fastjson.JSON;

import cn.blackshop.basic.elasticearch.document.ProductDocument;
import cn.blackshop.basic.elasticearch.repository.ProductDocumentRepository;
import cn.blackshop.basic.elasticearch.service.EsSearchService;
import lombok.extern.slf4j.Slf4j;

/**
 * elasticsearch 搜索引擎 service实现
 * @author zibin
 */
@Slf4j
public class EsSearchServiceImpl extends BaseSearchServiceImpl<ProductDocument> implements EsSearchService{

	@Resource
    private ElasticsearchTemplate elasticsearchTemplate;
	
    @Resource
    private ProductDocumentRepository productDocumentRepository;
    
	@Override
	public void save(ProductDocument... productDocuments) {
		 elasticsearchTemplate.putMapping(ProductDocument.class);
	        if(productDocuments.length > 0){
	            log.info("【保存索引】：{}",JSON.toJSONString(productDocumentRepository.saveAll(Arrays.asList(productDocuments))));
	        }
	}

	@Override
	public void delete(String id) {
		 productDocumentRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		 productDocumentRepository.deleteAll();
	}

	@Override
	public ProductDocument getById(String id) {
		 return productDocumentRepository.findById(id).get();
	}

	@Override
	public List<ProductDocument> getAll() {
		  List<ProductDocument> list = new ArrayList<ProductDocument>();
	      productDocumentRepository.findAll().forEach(list::add);
	      return list;
	}

}
