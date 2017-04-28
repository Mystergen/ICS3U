import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Life
 * @author ethanzhou
 *April 26 2017
 */
public class JFrameWithLife {
	
	static int width = 200, height = 200;
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		Canvas canvas = new Canvas();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(null);
		frame.setVisible(true);
		
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack();
		
	}
}
