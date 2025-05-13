package com.example.LearnSpringFramwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.GamingConsole;
import com.example.LearnSpringFramwork.game.PacMan;


@Configuration
public class App03GamingSpringBeans {
	
	@Bean
	public GamingConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	
	public static void main(String[] args) {
		
		var ctx = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);
		ctx.getBean(GamingConsole.class).up();
		
		ctx.getBean(GameRunner.class).run();
	}

}
