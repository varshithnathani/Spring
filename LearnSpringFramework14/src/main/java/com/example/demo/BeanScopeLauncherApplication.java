package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication{

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class);
		
		
		System.out.println(ctx.getBean(NormalClass.class));
		System.out.println(ctx.getBean(NormalClass.class));

		
		System.out.println(ctx.getBean(PrototypeClass.class));
		System.out.println(ctx.getBean(PrototypeClass.class));
		System.out.println(ctx.getBean(PrototypeClass.class));

		
	
		
	}

}


@Component
class NormalClass{
	
}

//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value="prototype")
@Component
class PrototypeClass{
	
}