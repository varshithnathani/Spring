package com.example.LearnSpringFramwork;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		// 1. Launch Spring Context		
		var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		System.out.println(ctx.getBean("person"));
		System.out.println(ctx.getBean("person2MethodCall"));
		System.out.println(ctx.getBean("person3"));

		
		// to know how many beans are there in this pack.
		// we use getBeanDefinitionNames() --> to get the names of the beans.
		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		
		
	}

}
