package com.springcore.StandAloneCollections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String,Integer> courses;
	
	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + "]";
	}

	
	
	
}
