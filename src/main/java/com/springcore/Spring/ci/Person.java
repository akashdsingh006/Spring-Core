package com.springcore.Spring.ci;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private Certificate certificate;
	private List<String> degree;
	
	public Person(String name, int age,Certificate certificate,List<String> degree) {
		super();
		this.name = name;
		this.age = age;
		this.certificate=certificate;
		this.degree=degree;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +" : "+this.age + "{"+this.certificate+"}" +"->"+this.degree;
	}
	
	
}
