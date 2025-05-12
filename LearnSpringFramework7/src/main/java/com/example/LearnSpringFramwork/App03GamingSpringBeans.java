package com.example.LearnSpringFramwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.GamingConsole;

public class App03GamingSpringBeans {
	
	public static void main(String[] args) {
		
		var ctx = new AnnotationConfigApplicationContext(GamingConfigurations.class);
		ctx.getBean(GamingConsole.class).up();
		
		ctx.getBean(GameRunner.class).run();
	}

}
