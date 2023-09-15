package com.kiccha.organic.entities;



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
@Table(name="CustomerDetails")
public class Customer {

	@Id
	@Nonnull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	@Nonnull
	private String name;
	@Column
	@Nonnull
	private String uname;
	@Column
	@Nonnull
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Customer() {
		
		}
		
	public Customer(Long id, String name, String uname, String password) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.password = password;
	}
	

}
