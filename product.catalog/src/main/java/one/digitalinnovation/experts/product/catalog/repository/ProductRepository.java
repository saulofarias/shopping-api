package one.digitalinnovation.experts.product.catalog.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import one.digitalinnovation.experts.product.catalog.model.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, Long> {

}
