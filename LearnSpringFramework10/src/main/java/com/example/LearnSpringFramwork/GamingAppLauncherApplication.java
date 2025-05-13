package com.example.LearnSpringFramwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.GamingConsole;
import com.example.LearnSpringFramwork.game.PacMan;


@Configuration
@ComponentScan("com.example.LearnSpringFramwork.game")
public class GamingAppLauncherApplication {
	// we are creating the @Component for all the games present at "com.example.LearnSpringFramework.game"
	// while executing we will get an error stating that there are two beans with same type. 
	// to solve this issue we can use @Primary to execute or even we can use @Qualifier
	
	
	public static void main(String[] args) {
		
		var ctx = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
		ctx.getBean(GamingConsole.class).up();
		
		ctx.getBean(GameRunner.class).run();
	}

}
