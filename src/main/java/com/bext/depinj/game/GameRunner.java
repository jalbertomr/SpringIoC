package com.bext.depinj.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	private GamingConsole game;

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
