package def.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	public BufferedImage load(String path){//buffered image is just an image, path is where file is located on computer
		try{//try catch loop will try a piece of code, and if it cant find image or error, it will print error on screen
			return ImageIO.read(getClass().getResource(path));//returns image where the image is located
		}catch (IOException e){
			e.printStackTrace();
		}
		return null;//returns nothing
	}
	
}
