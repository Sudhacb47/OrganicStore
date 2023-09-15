package com.kiccha.organic.services.inter;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiccha.organic.entities.Product;


public interface ProductService {

	public List<Product> getProducts();
	
	public List<Product> showpro();

	public String addproducts(Product p);

}
