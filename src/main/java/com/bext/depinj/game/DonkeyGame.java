package com.bext.depinj.game;

import org.springframework.stereotype.Component;

@Component
public class DonkeyGame implements GamingConsole{
	public void up() { System.out.println("Donkey up");}
	public void down() { System.out.println("Donkey down");}
	public void left() { System.out.println("Donkey left");}
	public void right() { System.out.println("Donkey right");}
}
