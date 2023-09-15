package com.kiccha.organic.entities;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customer_cart")
public class Cart {

	public Cart() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Nonnull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private List<Product> product_list;
	@Column
	private Integer cart_value;
	@Column
	private Customer cust_name;
	@Column
	private Long cust_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Product> getProduct_list() {
		return product_list;
	}
	public void setProduct_list(List<Product> product_list) {
		this.product_list = product_list;
	}
	public Integer getCart_value() {
		return cart_value;
	}
	public void setCart_value(Integer cart_value) {
		this.cart_value = cart_value;
	}
	public Customer getCust_name() {
		return cust_name;
	}
	public void setCust_name(Customer cust_name) {
		this.cust_name = cust_name;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public Cart(Long id, List<Product> product_list, Integer cart_value, Customer cust_name, Long cust_id) {
		super();
		this.id = id;
		this.product_list = product_list;
		this.cart_value = cart_value;
		this.cust_name = cust_name;
		this.cust_id = cust_id;
	}

}
