package com.springcore.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/StandAloneCollections/config.xml");
		Person person=applicationContext.getBean(Person.class);
		
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("------------------------------------------");
		System.out.println(person.getCourses());
	}

}
