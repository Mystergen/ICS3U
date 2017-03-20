package zhou;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console("Gamer For Noobs?");
		/*c.println("Hello, I am bob, what is your favourite type of pie out of the three (apple, blueberry, meat)?");
		String pie = c.readLine();
		c.println("Oh no, an earthquake is happening, run, I think there are aliens");
		String name = c.readLine();
		if (pie == "apple")
		{
			c.println("Hey what is your name?");
			c.println("Hey " + name + "are we going to run into the hospital or are we going to run into the school (hospital/school)");
			String firstDec = c.readLine();
			//at hospital
			if (firstDec == "hospital")
			{
				c.println ("Hey look there, is that a little girl, why don't we go talk to here?(yes/no)");
				String secondDec = c.readLine();
				//if yes then the person will die
				if (secondDec == "yes")
				{
					c.println("Oh no, it looks like she is a zombie, RUN!!, OH poor " + name + "why did he have to die");
					c.clear();
				}
				//goes to school instead
				else
				{
					c.println ("I think this hospital is dangerous, lets leave");
					c.println ("Lets go to the school instead, I'm bored");
					//add the if statement from the school
				}
			}
			//at school
			else if (firstDec == "school")
			{
				c.println ("Hey, look there, is that a pencil, why does that pencil look like a wand? Are you goint to pick it up(yes/no)");
				String thirdDec = c.readLine();
				if (thirdDec == "yes")
				{
					c.println("It looks like you have you now have magic powers, HAHA, looks like you could becom harry potter. Why don't you get round glasses and join Hogwarts");
					c.println("Do you want to explore the rest of the school(yes/no)");
					String fourthDec = c.readLine();
					//explores school
					if (fourthDec == "yes")
					{
						c.println("Hey, why don't we go");
					}
					else//person dies
					{
						
					}
					
				}
				
			}
		}*/
		for(int counter = 0; counter < 9; counter++)
		{
			c.println(counter);
			if(counter<6)
			{
				if(counter ==3)
				{
					c.println("hello");
				}
			}
			else
			{
				if(counter == 6)
				{
				c.println("nay");
				}
			}
				
		}
	}

}
