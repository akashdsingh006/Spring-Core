package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	//Reference Injection with @Autowired
	//@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//Setter Injection - @Autowired
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	//Constructor Injection 
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

}
