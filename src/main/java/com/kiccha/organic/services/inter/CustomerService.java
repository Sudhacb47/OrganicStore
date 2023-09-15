package com.kiccha.organic.services.inter;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiccha.organic.dto.Customerdto;
import com.kiccha.organic.entities.Customer;
import com.kiccha.organic.entities.Product;


public interface CustomerService {
	
	public void customersignup(Customer customer);
	
	public String customerlogin(Customerdto customer);
	
	public List<Product> showproduct();
	
	public void AddToCart(List<Product> prod);
	

}
