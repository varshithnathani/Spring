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
	
//	@Bean
//	public GamingConsole game() {
//		var game = new PacMan();
//		return game;
//	}
	
	// in the above case we are creating the @Bean by our self, but if we want spring to create
	// we need to mention @Component in the bean needed class 
	// + we need to mention the @ComponentScan in the main method and need to give the package info for accessing it.
	
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("parameter: "+game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	
	public static void main(String[] args) {
		
		var ctx = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
		ctx.getBean(GamingConsole.class).up();
		
		ctx.getBean(GameRunner.class).run();
	}

}
