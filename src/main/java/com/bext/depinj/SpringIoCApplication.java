package com.bext.depinj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.bext.depinj.game.GameRunner;

@SpringBootApplication
@ComponentScan("com.bext.depinj")
public class SpringIoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIoCApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		//GamingConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner( game);
		runner.runGame();
	}

}
