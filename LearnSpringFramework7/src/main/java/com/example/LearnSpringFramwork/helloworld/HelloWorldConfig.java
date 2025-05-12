package com.example.LearnSpringFramwork.helloworld;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

//record Person(String lName, String fName) {}

record Person(String lName, String fName, Address address) {}

record Address(String hsNo, String city) {}


@Configuration
public class HelloWorldConfig {
	
	
	@Bean(name = "lName")
	public String lName() {
		return "Bongu";
	}
	// both are same.
	@Bean
//	@Qualifier("fName")
	public String fName() {
		return "All";
	}
	
	@Bean
	public Person person() {
		return new Person("Nathani", "Varshith", new Address("103-SR","Marturu"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(lName(),fName(), address());
	}
	
	
	@Bean
	public Address address() {
		return new Address("SR RECEDENCE","Martur");
	}
	
//	@Bean
//	public Person person3(String lName, String fName, Address address) {
//		return new Person(lName,fName,address);
//	}
//	
//	@Bean
//	public Person person3(Address address) {
//	    return new Person(lName(), fName(), address);
//	}
	
//	@Bean
//	public Person person3(Address address) {
//	    return new Person(lName(), "my Friend", address);
//	}
//	
//	
	
	// @Qualifier("lName") tells Spring to inject the bean named lName.
	// @Qualifier is used when multiple beans of the same type exist, and we need to specify which one Spring should inject.
	@Bean
	public Person person3(@Qualifier("lName") String lName, @Qualifier("fName") String fName, Address address) {
	    return new Person(lName, fName, address);
	}
	
	// if we have multiple matching bean, at that time spring won't accept the bean data
	// so we can use @Primary after the @Bean so that it took the @Primary mentioned bean
	// rest ignored.
	
	// or else we can use the @Qualifier and be specific.

	
	
}
