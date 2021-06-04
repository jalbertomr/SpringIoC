package com.bext.depinj.game;

public class GameRunner {
	
	private PacmanGame game;

	public GameRunner(PacmanGame game) {
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
