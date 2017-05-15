import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

/**
 * 
 * @author ethanzhou
 *April 29 2017
 */
public class RandomPlace implements Runnable{
	
	static JFrame frame = new JFrame();
	static Canvas canvas = new Canvas();
	static int height = 200, width = 200;
	private BufferStrategy bs;
	
	public static void main(String[] args){
		
	}
	
	public static void create(){
		frame.setSize(width, height);
		frame.setLocation(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setVisible(true);
		
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
	
	private void render(){
		bs = create .getCanvas().getBufferStartegy();
	}
	
	public void run(){
		create();
	}
	
}
