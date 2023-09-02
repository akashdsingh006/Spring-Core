package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Store {
	private String address;
	private int id;
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Store [address=").append(address).append(", id=").append(id).append("]");
		return builder.toString();
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("I am statrting everything");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("I am going to end it babe...");
	}
}
