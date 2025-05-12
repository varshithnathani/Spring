package com.example.LearnSpringFramwork;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


record Person(String lName, String city) {}
@Configuration
public class HelloWorldConfig {
	
	@Bean
	public String name() {
		return "Varshith";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	
//	@Bean
//	public String lName() {
//		return "Nathani";
//	}
//	
//	@Bean
//	public String city() {
//		return "Martur";
//	}

	@Bean
	public Person person() {
//		var person = new Person("Nathani","Varshith");
//		return person;
		return new Person("Nathani", "Varshith");
	}
	
}
