package com.springcore.Spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Spring/ci/ciconfig.xml");
	
		Person person=(Person) context.getBean("person");
		System.out.println(person);
	}
	

}
