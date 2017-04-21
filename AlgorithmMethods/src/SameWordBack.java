import java.util.Scanner;

/**
 * SameWordBack
 * Determines whether the word inputed is the same when read backwards
 * @author ethanzhou
 *April 18 2017
 */

public class SameWordBack {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args){
		do{
		System.out.println("Please input a word, and I will determine if that word is the same backwards");
		System.out.println(back(sc.nextLine()));
		System.out.println("Do you want to try again?");
		}while(sc.nextLine().equals("yes"));
	}
	
	public static boolean back(String word){
		for(int i = 0; i < word.length(); i++){
				if (word.charAt(i) == word.charAt(word.length()-1)){
					return true;
				}else{
					return false;
				}
			}
			
		return false;
		
	}
	
}
