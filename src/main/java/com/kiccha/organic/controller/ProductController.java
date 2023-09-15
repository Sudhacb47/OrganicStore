package com.kiccha.organic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiccha.organic.entities.Product;
import com.kiccha.organic.services.inter.ProductService;


@RestController
@RequestMapping("/Kiccha-Organic-Store")
public class ProductController {
	
     public ProductController() {
		
	}
	
	
	@Autowired
	ProductService proservice;
	
	@PostMapping("/AddProduct")
	public String AddProducts(@RequestBody Product p){
		return proservice.addproducts(p);
		
		
	}
	
	@GetMapping("/Products")
	public List<Product> getproduct(){
		
		return proservice.getProducts();
		
	}
	
	 @GetMapping("/ProductsHtml")
	    public String showProducts(Model model) {
	        // Retrieve product data from a repository or service
	        List<Product> products = proservice.getProducts();

	        // Add the product list to the model
	        model.addAttribute("products", products);

	        // Return the name of the Thymeleaf template to render
	        return "Product";
	    }

}
