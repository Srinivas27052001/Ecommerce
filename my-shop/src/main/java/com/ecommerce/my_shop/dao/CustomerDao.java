package com.ecommerce.my_shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.my_shop.dto.Customer;
import com.ecommerce.my_shop.repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository customerRepository;

	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public boolean checkEmailDuplicate(String email) {
		return customerRepository.existsByEmail(email);
		
	}

	public boolean checkMobileDuplicate(long mobile) {
		return customerRepository.existsByMobile(mobile);
	}

	public Customer findById(int id) {
		return customerRepository.findById(id).orElseThrow();
	}

	public Customer findByEmail(String email) {
		return customerRepository.findByEmail(email);
	}




}
