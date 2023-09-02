package com.springcore.Spring.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Spring/Ref/refconfig.xml");
		
		A obj=(A) context.getBean("aref");
		System.out.println(obj);
		
		B obj2=(B) context.getBean("b");
		System.out.println(obj2);
	}

}
