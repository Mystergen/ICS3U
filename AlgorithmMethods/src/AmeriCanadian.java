import java.util.Scanner;

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
				
				if(userInput.charAt(userInput.length()-1) == 'o' && userInput.charAt(userInput.length()) == 'r') {
				userInput.replace("or", "our");	
				
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