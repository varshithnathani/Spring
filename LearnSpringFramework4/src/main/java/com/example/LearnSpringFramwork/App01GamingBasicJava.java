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
		System.out.println(ctx.getBean("name"));
		
		System.out.println(ctx.getBean("age"));
//		System.out.println(ctx.getBean("lName"));
//		System.out.println(ctx.getBean("city"));

		System.out.println(ctx.getBean("person"));
		
		

	}

}
