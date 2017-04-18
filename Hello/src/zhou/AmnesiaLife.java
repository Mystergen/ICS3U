package zhou;
import java.io.IOException;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * AmnesiaLife.java
 * Generate adventure game
 * @author Ethan & Ryan
 * 2017/02/27
 */
import hsa_new.Console;

public class AmnesiaLife 
{

	public static void main(String[] args)
	{
		/*
		 * import picture into console
		 * sound
		 * maybe try and getting the typing char one at a time thing
		 * maybe find a way to prevent person from choosing a route
		 * organzie maybe
		 * maybe add more stuff
		 * 
		 */
		//generates console
		String title = "AmnesiaLife";
		Console c = new Console(40,80,title);
		c.println("Hello,\n I am your bionic conscious. You are a test subject for a new experimental technology.\n We will send you off, there is a chance that you may lose your memeory. If that does happen, we are not responsible. We will now begin.");
		int counter =0;
		//array determines which path player could go after finishing a tree
		String[]choices = new String [14];
		boolean[] setting = new boolean [3];
		//for(counter = 0; counter <= 3;)
		//{
		/*do
		{
			choices[14] = null;
			*/	
			setting[0] = false;
			setting[1] = false;
			setting[2] = false;
		do 
		{
			
			//reason and purpose to play
			c.println("You wake up in an empty room without memory of who you are and where you are.\n You look up and see 3 objects on a table, a rock, an easy button, and a pack of cigarettes. Which object do you choose? (rock/easy button/cigarettes)");
			choices[0]= c.readLine();
			c.clear();
		
			//rock setting starts
			if(choices[0].equals("rock") && setting[0] == false)
			{
				//creates the sound effects
				/*try{
					Clip theme = AudioSystem.getClip(); //create the clip object
					theme.open(AudioSystem.getAudioInputStream(new File("Teleport Sound Effect.mp3"))); //open the given file for the clip

					Thread.sleep(1000);
					Thread.sleep(5000);
					Thread.sleep(500);
					Thread.sleep(1000);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}*/
				//imports and displays image
				BufferedImage jpgImage = null;
				
				try {
					jpgImage = ImageIO.read(new File("resources/cav.jpg"));
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				c.drawImage (jpgImage, 0, 0, 800, 800, null);
				c.println("You have awaken in a dark cave, what are you going to do ? (explore/leave)");
				choices[1] = c.readLine();
				c.clear();
				
				if(choices[1].equals("explore"))
				{c.drawImage (jpgImage, 0, 0, 800, 800, null);
					c.println("You search the walls of the cave and find nothing, do you keep searching ? (yes/no)");

					choices[3] = c.readLine();
					c.clear();
					if(choices[3].equals("yes"))
					{c.drawImage (jpgImage, 0, 0, 800, 800, null);
						c.println("You found a portal, do you go though it ? (yes/no)");
						choices[4] = c.readLine();
						c.clear();
						if(choices[4].equals("yes"))
						{c.drawImage (jpgImage, 0, 0, 800, 800, null);
							//creates random number
							double tele = Math.random()*10;

							if(tele == 4)
							{c.drawImage (jpgImage, 0, 0, 800, 800, null);
								//you win the game, but not sure if the counter would work and how or when it would loop back
								counter = 3;
								c.println("You have won the game and now is the ruler of the world. Please play again.");
							}
							else
							{c.drawImage (jpgImage, 0, 0, 800, 800, null);
								counter++;
								c.println("You have gained one piece of your memory, you will be teleported back to where you have began\n Please don't pick rock again, unless you want to go down that road again and find another way \nout.");
							}
						}
						else
						{c.drawImage (jpgImage, 0, 0, 800, 800, null);
							c.println("You have died of starvation. Good luck next time!");
							c.readLine();
							c.clear();
							c.close();
						}
					}
					else
					{c.drawImage (jpgImage, 0, 0, 800, 800, null);
						c.println("You have died of starvation. Good luck next time!");
						c.readLine();
						c.clear();
						c.close();

					}
				}
				else//leave cave
				{
					c.drawImage (jpgImage, 0, 0, 800, 800, null);
					c.println("You leave the cave, you find a bone, do you pick it up ? (yes/no)");
					choices[5] = c.readLine();
					c.clear();
					if(choices[5].equals("yes"))
					{c.drawImage (jpgImage, 0, 0, 800, 800, null);
						c.println("You encounter a dinosaur and kill it. But then you collapse from exhaustion."
								+ "You end up waking up back in the room");
						counter++;
						c.println("please dont chose this path again");
						c.clear();
					}
					else
					{c.drawImage (jpgImage, 0, 0, 800, 800, null);
						c.println("you incounter a dinosaur and can't defend your self. You end up dying. Sucks to be you.");
						c.readLine();
						c.clear();
						c.close();
					}
				}
			}
			//easy button starts (future)
			else if (choices[0].equals ("easy button") && setting [1] == false)
			{
				/*try{
					Clip theme = AudioSystem.getClip(); //create the clip object
					theme.open(AudioSystem.getAudioInputStream(new File("Teleport Sound Effect.mp3"))); //open the given file for the clip

					Thread.sleep(1000);
					Thread.sleep(5000);
					Thread.sleep(500);
					Thread.sleep(1000);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}*/
				BufferedImage jpgImage = null;
				
				try {
					jpgImage = ImageIO.read(new File("resources/spc.jpg"));
					
				} catch (IOException e) {
					System.err.println("There was ana error loading the image.");
					e.printStackTrace();
				}
				c.drawImage (jpgImage, 0, 0, 800, 800, null);
				c.println("You wake up in a  pod. You move around and realize you are stuck inside,\n it is also becoming harder to breath. Where do you look ? (head/feet)");
				choices[6] = c.readLine();
				c.clear();
				if(choices[6].equals("head"))
				{c.drawImage (jpgImage, 0, 0, 800, 800, null);
					c.println("You have just found a bar and broken yourself free.\n You look around and notice another pod has been opened. Do you look around and look for the other person? (yes/no");
					choices[7] = c.readLine();
					c.clear();
					if(choices[7].equals("yes"))
					{c.drawImage (jpgImage, 0, 0, 800, 800, null);
						c.println("You found a girl collpased on the floor, do you help her ? (yes/no");
						choices[8] = c.readLine();
						c.clear();
						if (choices[8].equals("yes"))
						{c.drawImage (jpgImage, 0, 0, 800, 800, null);
							c.println("she wakes and warns you danger ahead, she leads you back to the room.");
							//make this section of code twice
							do {
								
								
								c.println("you see a microwave and a desk, which do you search (Microwave/desk)");

								choices[9] = c.readLine();
								c.clear();
								if (choices[9].equals("Microwave")||choices[9].equals("microwave"))
								{c.drawImage (jpgImage, 0, 0, 800, 800, null);
									c.println("you find glasses, you put them on, and wake up back in the first room, you now know what"
											+ " year it is.");
									counter++;
									c.println("please dont chose this path again");
								}
								else
								{c.drawImage (jpgImage, 0, 0, 800, 800, null);
									c.println("you find nothing, search again.");
								}
							}
							while ( choices[9].equals ("desk"));
						}
						else
						{c.drawImage (jpgImage, 0, 0, 800, 800, null);
							c.println("you continue on, but encounter a fire ahead. you die. ");
							c.readLine();
							c.clear();
							c.close();
							

						}
					}
					
					else
					{c.drawImage (jpgImage, 0, 0, 800, 800, null);
						do {
							c.println("you see a microwave and a desk, which do you search (Microwave/Desk)");

							choices[9] = c.readLine();
							c.clear();
							if (choices[9].equals("Microwave")||choices[9].equals("microwave"))
							{c.drawImage (jpgImage, 0, 0, 800, 800, null);
								c.println("you find glasses, you put them on, and wake up back in the first room, you now know what"
										+ " year it is.");
								counter++;
								c.println("please dont chose this path again unless you want to find another way to beat it");

							}
							else
							{c.drawImage (jpgImage, 0, 0, 800, 800, null);
								c.println("you find nothing, search again.");
							}
						}
						while ( !choices[9].equalsIgnoreCase("microwave"));
					}
				}
				else 
				{c.drawImage (jpgImage, 0, 0, 800, 800, null);
					c.println("you find nothing and die from suffocation. better luck next time");
					c.readLine();
					c.clear();
					c.close();
				}
			}
			//apocalypse starts (setting)
			else if (setting[2] == false)
			{
				/*try{
				Clip theme = AudioSystem.getClip(); //create the clip object
				theme.open(AudioSystem.getAudioInputStream(new File("Teleport Sound Effect.mp3"))); //open the given file for the clip

				Thread.sleep(1000);
				Thread.sleep(5000);
				Thread.sleep(500);
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}*/


				BufferedImage jpgImage = null;
				
				try {
					jpgImage = ImageIO.read(new File("resources/app.jpg"));
					
				} catch (IOException e) {
				
					e.printStackTrace();
				}
				c.drawImage (jpgImage, 0, 0, 800, 800, null);
			
				c.println("you wake up on a barren street, you see a hospital and the street ahead," +'\n' +"which way do you go?(street/hospital");
				choices[10] = c.readLine();
				c.clear();
				if (choices[10].equals("street"))
				{
					c.drawImage (jpgImage, 0, 0, 800, 800, null);
					//c.println("You see the zombies, then you run back to where you started.");
					c.println("You got over run by zombie and die. try again.");
					c.readLine();
					c.clear();
					c.close();
				}
				else
				{
					c.drawImage (jpgImage, 0, 0, 800, 800, null);
					c.println("You find a book, while reading it you become dizzy and awake back in the room. You get another piece of memory. ");
					counter++;
					c.println("please dont chose this path again unless you want to find another way to beat it");
					c.clear();
				}
			}
			if(choices[0].equals("rock"))
			{
				setting[0] = true;
				c.println("you cannot pick rock again.");
			}
			else if (choices[0].equals("easy button"))
			{
				setting[1] = true;
				c.println("you cannot pick easy button again.");
			}
			else
			{
				setting[2] = true;
				c.println("you cannot pick cigarette again.");
			}
		/*	c.println("Do you want to play again? (yes/no)");
		choices[14] = c.readLine();
		c.println("The game will not proceed until you answer the question.");*/
	

		}
		
		while (counter <= 3);
		
		c.println("You May Have Just Won IDK");
			//}
		//while(choices[14].equals("yes"));
		
		
		//{
		//	c.println("YOU WIN GOOD JOB!");
		//}


	}//main method

}
