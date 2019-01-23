/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.elasticearch.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

import lombok.Data;

/**
 * 商品搜索的文档实体
 * @author zibin
 */
@Document(indexName = "orders", type = "product")
@Mapping(mappingPath = "productIndex.json") // 解决IK分词不能使用问题
@Data
public class ProductDocument {
	@Id
    private String id;
    //@Field(analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String productName;
    //@Field(analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String productDesc;

    private Date createTime;

    private Date updateTime;
}
