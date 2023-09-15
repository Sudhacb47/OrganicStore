package com.kiccha.organic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiccha.organic.entities.Product;
import com.kiccha.organic.repository.ProductRepo;
import com.kiccha.organic.services.inter.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	ProductRepo prorepo;
	
	
	@Override
	public List<Product> getProducts() {
	
		List<Product> l = prorepo.findAll();
	
		return l;
	}

	
	public List<Product> showpro(){
		List<Product> L = new ArrayList<>();
		return L;
		
	}


	@Override
	public String addproducts(Product p) {
		
		
		
		prorepo.save(p);
		
		return "Product Added Sucessfully..!";
	}
}
