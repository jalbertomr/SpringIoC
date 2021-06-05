package com.bext.depinj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bext.depinj.game.GameRunner;
import com.bext.depinj.game.GamingConsole;

@SpringBootApplication
public class SpringIoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIoCApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		//GamingConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner( game);
		runner.runGame();
	}

}
