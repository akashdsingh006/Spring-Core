package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotations/autoconfig.xml");
		
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
