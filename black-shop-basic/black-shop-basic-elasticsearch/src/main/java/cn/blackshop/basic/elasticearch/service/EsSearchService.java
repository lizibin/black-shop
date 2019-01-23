/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.elasticearch.service;

import java.util.List;

import cn.blackshop.basic.elasticearch.document.ProductDocument;

public interface EsSearchService  extends BaseSearchService<ProductDocument> {
	/**
     * 保存
     */
    void save(ProductDocument... productDocuments);

    /**
     * 删除
     * @param id
     */
    void delete(String id);

    /**
     * 清空索引
     */
    void deleteAll();

    /**
     * 根据ID查询.
     *
     * @param id the id
     * @return the by id
     */
    ProductDocument getById(String id);

    /**
     * 查询全部
     * @return
     */
    List<ProductDocument> getAll();
}
