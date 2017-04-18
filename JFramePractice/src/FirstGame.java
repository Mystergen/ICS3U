import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

/**
 * First game trying to use the jframe, suppose to be a tile game
 * Name: Domen
 * @author danielzhou
 *April 5 2017
 */

public class FirstGame extends Canvas implements Runnable{//extends and implements allows more things

	public static boolean running = false;
	public static final int width = 360, height = 240, scale = 2;
	public Thread gameThread;//helps program multitask, lets methods multitask
	
	public synchronized void start(){//use synchronized when starting or stopping thread
		if(running)return;
		running = true;
		gameThread = new Thread(this);//giving gameThread the value of a thread for this class
		gameThread.start();
	}
	
	public synchronized void stop(){
		if(!running)return;
		running = false;
		try {
			gameThread.join();//closes thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//gets 60 fps and renders as fast as pc can
	public void run(){
		long lastTime = System.nanoTime();//gets amount of time in nanoseconds from computer
		final double amountOfTicks = 60D;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		while(running){//while condition true, it does what ever is in while loop, if false, doesn't do it
			//tick();//updates information like variables, coordinates
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1){
				tick();
				delta--;
			}
			render();//displays information like background or objects
		}
		stop();
	}
	
	public void tick(){
		
	}
	
	public void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);//buffers 3 images
			return;
		}
		Graphics g = bs.getDrawGraphics();
		//render here
		g.fillRect(0, 0, width*scale, height*scale);//displaying rectangle in game window/frame
		//end render
		g.dispose();//disposes of what was there
		bs.show();//shows what is above
	}
	
	public static void main(String[] args){
		FirstGame game = new FirstGame();//creates the game
		game.setPreferredSize(new Dimension(width*scale,height*scale));//makes the size of game, what is displayed
		game.setMaximumSize(new Dimension(width*scale, height*scale));//makes the game max size
		game.setMinimumSize(new Dimension(width*scale, height*scale));//makes the game min size
		
		JFrame frame = new JFrame("Tile RPG");//creates frame/window in java
		frame.setSize(width*scale, height*scale);//sets the size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes game properly
		frame.setResizable(false);//can't change size of frame
		frame.add(game);//displays game in  frame
		frame.setVisible(true);
	}
}

