/**
 * SumOfDigits
 * Finds the sum of all the digits inputed
 * @author ethanzhou
 *April 3 2017
 */
import java.util.Scanner;
public class SumDigits {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Input a number to find the sum of");
		int num = sumDig(sc.nextInt());
		System.out.println(num);
	}
	/**
	 * Finds the sum of all the digits in int n
	 * @param n is the number you want to find the sum of
	 * @return is the sum of the digits in n
	 */
	public static int sumDig(int n){
		int total = 0;
		while (n > 1){
			total = total + n%10;
			n = n/10;
		}
		total += n;
		return total;
	}
}
