package com.ait.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.main.Entity.CustomerEntity;

public interface CustomerEntityRepo extends JpaRepository<CustomerEntity, Integer> {

	
	
	
}
