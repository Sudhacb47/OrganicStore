package com.kiccha.organic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.kiccha.organic.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

	public String findByUname(String username);
}
