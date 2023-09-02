package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@Value("#{new java.lang.String('Pen')}") //SpEL for object
	private String name;
	
	@Value("#{T(java.lang.Integer).MAX_VALUE}") //SpEL for static variables
	private Integer id;
	
	@Value("#{T(java.lang.Math).sqrt(9)}") //SpEL for static method
	private Double num;
	
	@Value("#{new java.lang.Boolean(true)}")
	private boolean expired;
	
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	public Double getNum() {
		return num;
	}
	public void setNum(Double num) {
		this.num = num;
	}

	@Value("#{lists}")
	private List<String> users;
	
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	
	@Autowired
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Product(String name, Integer id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", num=" + num + ", expired=" + expired + ", users=" + users
				+ ", address=" + address + "]";
	}
	
	
	
}
