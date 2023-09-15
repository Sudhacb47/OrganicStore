package com.kiccha.organic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiccha.organic.dto.Customerdto;
import com.kiccha.organic.entities.Customer;
import com.kiccha.organic.entities.Product;
import com.kiccha.organic.repository.CartRepo;
import com.kiccha.organic.repository.CustomerRepo;
import com.kiccha.organic.repository.ProductRepo;
import com.kiccha.organic.services.inter.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo custrepo;
	
	@Autowired
	ProductRepo prodrepo;
	
	@Autowired
	CartRepo cartrepo;
	

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void customersignup(Customer customer) {
		custrepo.save(customer);
	}

	@Override
	public List<Product> showproduct() {
		
		List<Product> prodlist = new ArrayList<>();
		prodlist = prodrepo.findAll();
		return prodlist;
		
	}

	@Override
	public String customerlogin(Customerdto customer) {
		
		if(custrepo.findByUname(customer.getUsername()).isEmpty()) {
			return "User Not found..!";
		}else {
			return "User Login Sucessful..!";
		}
			
		
		
	}

	@Override
	public void AddToCart(List<Product> prod) {
		
		cartrepo.saveAll(prod);
		
	}

	
}
