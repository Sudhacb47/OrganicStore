package com.kiccha.organic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiccha.organic.dto.Customerdto;
import com.kiccha.organic.entities.Customer;
import com.kiccha.organic.entities.Product;
import com.kiccha.organic.services.inter.CustomerService;
import com.kiccha.organic.services.inter.ProductService;

@RestController
@RequestMapping("/Kiccha-Organic-Store")
public class CustomerController {

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	CustomerService custservice;
	
	@PostMapping("/signup")
	public String customersignup(@RequestBody Customer customer) {
		custservice.customersignup(customer);
		return "Hi "+customer.getName()+" your registration is sucessful..!";
		
	}
	
	@GetMapping("/signin")
	public String customersignin(@RequestBody Customerdto customer) {
		return custservice.customerlogin(customer);
	}
	
	@GetMapping("/showItems")
	public List<Product>productlist() {
		return custservice.showproduct();
	}
	@PostMapping("/additems")
	public String addtocart(@RequestBody List<Product> productlist ) {
		custservice.AddToCart(productlist);
		return "Products added to cart..!";
	}
	

}
