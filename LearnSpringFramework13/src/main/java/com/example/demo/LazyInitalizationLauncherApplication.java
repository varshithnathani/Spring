package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class LazyInitalizationLauncherApplication{

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(LazyInitalizationLauncherApplication.class);
		
		// refer the ClassB bean 
		ctx.getBean(ClassB.class).doSomething();
		
	}

}


@Component
class ClassA{
	
}


// Spring is Eager in nature, so it will get the beans as soon as it scan the component.
// but if we want to change this nature then we can add @Lazy --> it will use that bean only when someone refers it.

@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some Intialization Logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Something Something !!");
	}
}