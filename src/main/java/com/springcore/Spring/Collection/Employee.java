package com.springcore.Spring.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<Long> phone;
	private Set<String> address;
	private Map<String,Integer> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getPhone() {
		return phone;
	}
	public void setPhone(List<Long> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public Employee(String name, List<Long> phone, Set<String> address, Map<String, Integer> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", phone=").append(phone).append(", address=")
				.append(address).append(", courses=").append(courses).append("]");
		return builder.toString();
	}
	
	
	
}
