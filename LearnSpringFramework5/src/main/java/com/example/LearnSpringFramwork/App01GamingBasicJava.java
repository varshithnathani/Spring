package com.example.LearnSpringFramwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		// 1. Launch Spring Context		
		var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		// 2. Configure the things that we want spring to config -> @Configuration
		// HelloWorld -> @Configuration
		// name -> @Bean
		
		// 3. Retreving beans managed by spring
//		System.out.println(ctx.getBean("name"));
//		
//		System.out.println(ctx.getBean("age"));
////		System.out.println(ctx.getBean("lName"));
////		System.out.println(ctx.getBean("city"));
//
//		System.out.println(ctx.getBean("person"));
		
//		System.out.println(ctx.getBean("address")); // you will get error bcz we have given the @Bean("") our prefered name as bean.
		// so we need to use the name to get the access of the data inside the beans.
		
		System.out.println(ctx.getBean("address2"));
		
		// we can use the bean name or we can directly use the class name itself from from the package itself.		
		System.out.println(ctx.getBean(Address.class));
		
		

	}

}
