package com.springcore.Spring.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello..");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Spring/Collection/collectionconfig.xml");
		
		Employee emp=(Employee) context.getBean("employee1");
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourses());
	}

}
