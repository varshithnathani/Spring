package com.example.LearnSpringFramwork.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.GamingConsole;

import org.springframework.context.annotation.ComponentScan;


@Configuration
// @ComponentScan("com.example.LearnSpringFramwork.examples.a1")
// Same package so need need to mention the package location
@ComponentScan
public class DependecyLauncherApplication {	
	
	
	public static void main(String[] args) {
		
		var ctx = new AnnotationConfigApplicationContext(DependecyLauncherApplication.class);
		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(ctx.getBean(YourBusiness.class));
	}

}


// Field Injection 

@Component
class YourBusiness{
//	Dependency1 dep1;
//	Dependency2 dep2;  // These are not autowired so we get null and null in the syso
//	
//	public String toString() {
//		return "using "+dep1+" and "+dep2;
//	}
	
	// we need to mention autowired at the top of the dependency
	
	@Autowired
	Dependency1 dep1;
	
	@Autowired
	Dependency2 dep2;  
	
	public String toString() {
		return "using "+dep1+" and "+dep2;
	}	
	
	
		
	
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}
