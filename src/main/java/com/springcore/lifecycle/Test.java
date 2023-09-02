package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		//System.out.println(12);
//		Book book=(Book) context.getBean("book");
//
//		System.out.println(book);
//		System.out.println("--------------------------------");
//		Chair chair=(Chair) context.getBean("chair");
//		
//		System.out.println(chair);
		
		Store s=(Store) context.getBean("store");
		System.out.println(s);
		context.registerShutdownHook();
	}

}
