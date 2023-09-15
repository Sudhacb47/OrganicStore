package com.kiccha.organic.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.kiccha.organic.entities.Cart;
import com.kiccha.organic.entities.Product;

@Repository
@EnableJpaRepositories
public interface CartRepo extends JpaRepository<Cart,Long> {

	public void saveAll(Collection<Product> prod);

}
