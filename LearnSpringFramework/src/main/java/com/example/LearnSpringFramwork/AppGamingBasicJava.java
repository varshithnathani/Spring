package com.example.LearnSpringFramwork;

import com.example.LearnSpringFramwork.game.GameRunner;
import com.example.LearnSpringFramwork.game.MarioGame;
import com.example.LearnSpringFramwork.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		//var gameRunner = new GameRunner(marioGame);
		var gameRunner = new GameRunner(superContraGame);

		gameRunner.run();

	}

}
