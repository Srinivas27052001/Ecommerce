package com.ecommerce.my_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.my_shop.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>
{

}
