/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.elasticearch.service;

import java.util.List;
import java.util.Map;

import cn.blackshop.basic.elasticearch.page.Page;

public interface BaseSearchService<T> {

	 /**
     * 搜 索
     * @param keyword
     * @param clazz
     * @return
     */
    List<T> query(String keyword, Class<T> clazz);

    /**
     * 搜索高亮显示
     * @param keyword       关键字
     * @param indexName     索引库
     * @param fieldNames    搜索的字段
     * @return
     */
    List<Map<String,Object>> queryHit(String keyword, String indexName, String ... fieldNames);

    /**
     * 搜索高亮显示，返回分页
     * @param pageNo        当前页
     * @param pageSize      每页显示的总条数
     * @param keyword       关键字
     * @param indexName     索引库
     * @param fieldNames    搜索的字段
     * @return
     */
    Page<Map<String,Object>> queryHitByPage(int pageNo,int pageSize,String keyword, String indexName, String ... fieldNames);

    /**
     * 删除索引库
     * @param indexName
     * @return
     */
    void deleteIndex(String indexName);
}
