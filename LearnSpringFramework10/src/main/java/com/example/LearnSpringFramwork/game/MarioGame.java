package com.example.LearnSpringFramwork.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go into a Hole");
	}
	public void left() {
		System.out.println("Go Left");
	}
	public void right() {
		System.out.println("Accelerate");
	}

}
