package com.example.LearnSpringFramwork.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	MarioGame game;
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}
//	
//	public void run() {
//		System.out.println("running "+game);
//		
//		game.up();
//		game.down();
//		game.left();
//		game.right();
//	}
	
//	SuperContraGame game;
//	public GameRunner(SuperContraGame game) {
//		this.game = game;
//	}
//	public void run() {
//	System.out.println("running "+game);
//	
//	game.up();
//	game.down();
//	game.left();
//	game.right();	
//}
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		game.up();
     	game.down();
		game.left();
		game.right();
		
	}
	

}
