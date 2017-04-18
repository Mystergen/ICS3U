package dev.tilegame;

import dev.tilegame.display.Display;

public class Launcher {

	public static void main(String[] args){
		Game game = new Game("Game", 400, 400);
		game.start();
	}
}
