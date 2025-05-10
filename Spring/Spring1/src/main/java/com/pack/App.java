package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Alien obj1 = (Alien) context.getBean("alien");
		//obj1.Code();
		
		// obj1.setAge(21); 
		// we can use setter injection in beans.xml 
		System.out.println(obj1.getAge());
		obj1.Code();
		
		
//		Alien obj2 = (Alien) context.getBean("alien");
//		//obj2.Code();
//		System.out.println(obj2.age);

	}

}
