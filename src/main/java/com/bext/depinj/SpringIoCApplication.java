package com.bext.depinj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bext.depinj.game.GameRunner;
import com.bext.depinj.game.PacmanGame;

@SpringBootApplication
public class SpringIoCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoCApplication.class, args);
		
		PacmanGame game = new PacmanGame();
		GameRunner runner = new GameRunner( game);
		runner.runGame();
	}

}
