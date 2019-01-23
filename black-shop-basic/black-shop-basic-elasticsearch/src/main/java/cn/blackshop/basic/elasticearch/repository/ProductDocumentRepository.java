package cn.blackshop.basic.elasticearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import cn.blackshop.basic.elasticearch.document.ProductDocument;

@Component
public interface ProductDocumentRepository extends ElasticsearchRepository<ProductDocument,String> {}
