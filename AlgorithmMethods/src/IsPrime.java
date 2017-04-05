/**
 * PrimeAllDay
 * Finds out if the number inputed is prime
 * @author ethanzhou
 *April 4 2017
 */
import java.util.Scanner;
public class IsPrime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		do{
		System.out.println("Input a number, and I will tell you if it is prime or not");
		int input = sc.nextInt();
		System.out.println(iPrime(input));
		System.out.println("Do you want to try again? \n yes \n no");
		}while(sc.next().equals("yes"));
	}
	/**
	 * Finds out if the number inputed is prime or not prime
	 * @param real is the number the user has inputed
	 * @return returns a response if it is prime or not prime
	 */
	public static String iPrime(int real){
	if (real < 1){
		return ("is prime");
	}else{
		for (int i = 2; i < (real-1); i++){
			if(real%i == 0){
				return ("is prime");
			}else if (i== (real-1)){
				return("is not prime");
			}
		}
	}
	return ("is not prime");
	
	}
}
