package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
public class RealWorldExBusinessCalulationServiceApplication {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(RealWorldExBusinessCalulationServiceApplication.class);
		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(ctx.getBean(BusinessCal.class).findmax());

	}

}
