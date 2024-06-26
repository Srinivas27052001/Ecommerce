package com.ecommerce.my_shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.my_shop.dto.Product;
import com.ecommerce.my_shop.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository productRepository;

	public boolean checkName(String name) {
		return productRepository.existsByName(name);
	}

	public void save(Product product) {
		productRepository.save(product);
	}

	public List<Product> fetchAll() {
		return productRepository.findAll();
	}

	public Product findById(int id) {
		return productRepository.findById(id).orElseThrow();
	}

	public void delete(Product product) {
		productRepository.delete(product);
	}

	public Product findByName(String name) {
		return productRepository.findByName(name);
	}

}
