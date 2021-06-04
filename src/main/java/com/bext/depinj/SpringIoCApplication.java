package com.bext.depinj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bext.depinj.game.GameRunner;
import com.bext.depinj.game.MarioGame;

@SpringBootApplication
public class SpringIoCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoCApplication.class, args);
		
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner( game);
		runner.runGame();
	}

}
