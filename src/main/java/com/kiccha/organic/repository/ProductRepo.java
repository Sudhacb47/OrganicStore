package com.kiccha.organic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.kiccha.organic.entities.Product;

@Repository
@EnableJpaRepositories
public interface ProductRepo extends JpaRepository<Product,Long> {

}
