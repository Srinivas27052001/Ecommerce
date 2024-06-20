package com.ecommerce.my_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.my_shop.dto.ShoppingOrder;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer> {

}
