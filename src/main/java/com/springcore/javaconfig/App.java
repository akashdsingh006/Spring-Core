package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=applicationContext.getBean("student",Student.class);
		System.out.println(student);
		System.out.println("_________________________");
		
		
		//Calling this bean using Configuration without Component annotatiton on Address class
		Address address=applicationContext.getBean(Address.class);
		System.out.println(address);
	}

}
