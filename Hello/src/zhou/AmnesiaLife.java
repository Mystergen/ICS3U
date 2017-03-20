package zhou;
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
		Console c = new Console();
		c.println("Hello,\n I am your bionic conscious. You are a test subject for a new experimental technology.\n We will send you off, there is a chance that you may lose your memeory. If that does happen, we are not responsible. We will now begin.");
		int counter =0;
		//array determines which path player could go after finishing a tree
		String[]choices = new String [13];
		boolean[] setting = new boolean [3];
		//for(counter = 0; counter <= 3;)
		//{
		do 
		{
			//reason and purpose to play
			c.println("You wake up in an empty room without memory of who you are and where you are.\n You look up and see 3 objects on a table, a rock, an easy button, and a pack of cigarettes. Which object do you choose? (rock/easy button/cigarettes)");
			choices[0]= c.readLine();
			c.clear();
			setting[0] = false;
			setting[1] = false;
			setting[2] = false;
			//rock setting starts
			if(choices[0].equals("rock") && setting[0] == false)
			{
				
				c.println("You have awaken in a dark cave, what are you going to do ? (explore/leave)");
				choices[1] = c.readLine();
				c.clear();
				
				if(choices[1].equals("explore"))
				{
					c.println("You search the walls of the cave and find nothing, do you keep searching ? (yes/no)");

					choices[3] = c.readLine();
					c.clear();
					if(choices[3].equals("yes"))
					{
						c.println("You found a portal, do you go though it ? (yes/no)");
						choices[4] = c.readLine();
						c.clear();
						if(choices[4].equals("yes"))
						{
							//creates random number
							double tele = Math.random()*10;

							if(tele == 4)
							{
								//you win the game, but not sure if the counter would work and how or when it would loop back
								counter = 3;
								c.println("You have won the game and now is the ruler of the world. Please play again.");
							}
							else
							{
								counter++;
								c.println("You have gained one piece of your memory, you will be teleported back to where you have began\n Please don't pick rock again, unless you want to go down that road again and find another way \nout.");
							}
						}
						else
						{
							c.println("You have died of starvation. Good luck next time!");


						}
					}
					else
					{
						c.println("You have died of starvation. Good luck next time!");


					}
				}
				else//leave cave
				{
					c.println("You leave the cave, you find a bone, do you pick it up ? (yes/no)");
					choices[5] = c.readLine();
					c.clear();
					if(choices[5].equals("yes"))
					{
						c.println("You encounter a dinosaur and kill it. But then you collapse from exhaustion."
								+ "You end up waking up back in the room");
						//counter++;
						c.println("please dont chose this path again unless you want to find another way to beat it");
					}
					else
					{
						c.println("you incounter a dinosaur and can't defend your self. You end up dying. Sucks to be you.");


					}
				}
			}
			//easy button starts (future)
			else if (choices[0].equals ("easy button") && setting [1] == false)
			{
				
				c.println("You wake up in a  pod. You move around and realize you are stuck inside,\n it is also becoming harder to breath. Where do you look ? (head/feet)");
				choices[6] = c.readLine();
				c.clear();
				if(choices[6].equals("head"))
				{
					c.println("You have just found a bar and broken yourself free.\n You look around and notice another pod has been opened. Do you look around and look for the other person? (yes/no");
					choices[7] = c.readLine();
					c.clear();
					if(choices[7].equals("yes"))
					{
						c.println("You found a girl collpased on the floor, do you help her ? (yes/no");
						choices[8] = c.readLine();
						c.clear();
						if (choices[8].equals("yes"))
						{
							c.println("she wakes and warns you danger ahead, she leads you back to the room.");
							//make this section of code twice
							do {
								c.println("you see a microwave and a desk, which do you search (Microwave/desk)");

								choices[9] = c.readLine();
								c.clear();
								if (choices[9].equals("Microwave")||choices[9].equals("microwave"))
								{
									c.println("you find glasses, you put them on, and wake up back in the first room, you now know what"
											+ " year it is.");
									counter++;
									c.println("please dont chose this path again unless you want to find another way to beat it");
								}
								else
								{
									c.println("you find nothing, search again.");
								}
							}
							while ( choices[9].equals ("desk"));
						}
						else
						{
							c.println("you continue on, but encounter a fire ahead. you die. ");
							//c.clear();

						}
					}
					
					else
					{
						do {
							c.println("you see a microwave and a desk, which do you search (Microwave/Desk)");

							choices[9] = c.readLine();
							c.clear();
							if (choices[9].equals("Microwave")||choices[9].equals("microwave"))
							{
								c.println("you find glasses, you put them on, and wake up back in the first room, you now know what"
										+ " year it is.");
								counter++;
								c.println("please dont chose this path again unless you want to find another way to beat it");

							}
							else
							{
								c.println("you find nothing, search again.");
							}
						}
						while ( !choices[9].equalsIgnoreCase("microwave"));
					}
				}
				else 
				{
					c.println("you find nothing and die from suffocation. better luck next time");
				}
			}
			//apocalypse starts (setting)
			else if (setting[2] == false)
			{
				
				c.println("you wake up on a barren street, you see a hospital and the street ahead,/n which way do you go?(street/hospital");
				choices[10] = c.readLine();
				c.clear();
				if (choices[10].equals("street"))
				{




					//c.println("You see the zombies, then you run back to where you started.");


					c.println("You got over run by zombie and die. try again.");
				}




				else
				{
					c.println("You find a book, while reading it you become dizzy and awake back in the room. You get another piece of memory. ");
					counter++;
					c.println("please dont chose this path again unless you want to find another way to beat it");
				}
			}
			if(choices[0].equals("rock"))
			{
				setting[0] = true;
			}
			else if (choices[0].equals("easy button"))
			{
				setting[1] = true;
			}
			else
			{
				setting[2] = true;
			}
		
		}
		
		while (counter <= 3);
		//{
		//	c.println("YOU WIN GOOD JOB!");
		//}


	}

}
