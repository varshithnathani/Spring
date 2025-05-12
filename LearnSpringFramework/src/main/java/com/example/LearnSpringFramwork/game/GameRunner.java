package com.example.LearnSpringFramwork.game;

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
	
	SuperContraGame game;
	public GameRunner(SuperContraGame game) {
		this.game = game;
	}
	public void run() {
	System.out.println("running "+game);
	
	game.up();
	game.down();
	game.left();
	game.right();
}
	

}
