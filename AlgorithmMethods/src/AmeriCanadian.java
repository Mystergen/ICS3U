import java.util.Scanner;
/**
 * AmeriCanadian
 * Checks if the word inputed is using American spelling or Canadian spelling
 * @author ethanzhou
 *April 24 2017
 */
public class AmeriCanadian {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();

		
		if (!userInput.equals ("quit!")) {

			if (userInput.length() > 4 && userInput.length() < 65) {

				/*String [] wordLength = new String[userInput.length()-1];
				for (int i = 0; i < userInput.length(); i++) {
					wordLength[i] = userInput.charAt(i);
				}*/
				//something wrong with if statement
				if(userInput.charAt(userInput.length()-2) == 'o' && userInput.charAt(userInput.length())-1 == 'r') {
				userInput = userInput.replace("or", "our");	
				
				}
				System.out.println(userInput);
				
				
			}
			else {
				System.out.println("Please enter a word with more than 4 characters but less than 64.");
				userInput = scan.nextLine();
			}
			
			
		}


	}

}
