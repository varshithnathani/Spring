package com.example.LearnSpringFramwork;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.MarioGame;
import com.example.LearnSpringFramwork.game.PacMan;
import com.example.LearnSpringFramwork.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		//var gameRunner = new GameRunner(marioGame);
		var game = new PacMan();
		var gameRunner = new GameRunner(game);

		gameRunner.run();

	}

}
