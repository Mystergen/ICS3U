	package dev.tilegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.tilegame.display.Display;

public class Game implements Runnable {

	private Display display;
	
	public int width, height;
	public String title;
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		//display = new Display(title, width, height);
	}
	
	private void init(){
		display = new Display(title, width, height);
	}
	
	private void tick(){
		
	}
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		g.clearRect(0,0,width, height);
		
		g.setColor(Color.blue);
		g.fillRect(10, 50, 45, 45);
		g.setColor(Color.green );
		g.fillRect(1, 4, 34, 45);
		bs.show();
		g.dispose();
	}
	
	public void run(){
		init();
		
		while(running){
			tick();
			render();
		}
		stop();
	}
	
	public synchronized void start(){
		if(running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop(){
		if(!running)return;
			running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
