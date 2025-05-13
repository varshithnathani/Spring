package com.example.LearnSpringFramwork.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("UP _ PACMAN");
	}
	public void down() {
		System.out.println("DOWN _ PACMAN");
	}
	public void left() {
		System.out.println("LEFT _ PACMAN");
	}
	public void right() {
		System.out.println("RIGHT _ PACMAN");
	}
}
