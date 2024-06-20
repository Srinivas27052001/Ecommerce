package com.ecommerce.my_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.my_shop.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	boolean existsByName(String name);

	Product findByName(String name);

}
