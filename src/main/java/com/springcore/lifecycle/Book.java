package com.springcore.lifecycle;

public class Book {
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [name=").append(name).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	public void init()
	{
		System.out.println("Initialization method ------");
	}
	public void destroy()
	{
		System.out.println("I am going to be destroyed......");
	}
}
