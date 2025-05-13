package com.example.LearnSpringFramwork.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.GamingConsole;

import org.springframework.context.annotation.ComponentScan;


@Configuration
// @ComponentScan("com.example.LearnSpringFramwork.examples.a1")
// Same package so need need to mention the package location
@ComponentScan
public class SimpleSpringLauncherApplicaiton {	
	public static void main(String[] args) {
		
//		var ctx = new AnnotationConfigApplicationContext(DependecyLauncherApplication.class);
//		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
