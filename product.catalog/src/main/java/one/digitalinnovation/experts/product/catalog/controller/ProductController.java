package one.digitalinnovation.experts.product.catalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.experts.product.catalog.model.Product;
import one.digitalinnovation.experts.product.catalog.repository.ProductRepository;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping(value = "/{id}")
	Optional<Product> getById(@PathVariable Long id) {
		return productRepository.findById(id);
	}

	@PostMapping
	Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}

}
