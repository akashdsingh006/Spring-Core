package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Product product=(Product) applicationContext.getBean("product");
		
		System.out.println(product);
	}

}
