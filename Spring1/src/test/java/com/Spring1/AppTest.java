package com.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
	
		System.out.println("wellcome");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring1/NewFile.xml");
		Student s1=(Student) context.getBean("abc");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		
	}
   
 	
}
