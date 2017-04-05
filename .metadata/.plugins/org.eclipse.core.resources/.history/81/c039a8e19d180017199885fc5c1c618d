/**
 * Greatest common factor
 * Gets the greatest common factor of a number
 * @author ethanzhou
 *April 3 2017
 */
import java.util.Scanner;
public class Gcf {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Input two numbers for what you want to find the greatest common factor for");
		int a = (sc.nextInt());
		int b = (sc.nextInt());
		System.out.println(findGcf(a,b));
	}
	/**
	 * finds the greatest common factor of int a and int b
	 * @param a is one of the numbers that you want to find the gcf for
	 * @param b is one of the numbers that you want to find the gcf for
	 * @return counter is the gcf for int a and int b
	 */
	public static int findGcf(int a,int b){
		int big = Math.max(a, b);
		int small = Math.min(a,b);
		int counter = small;
		while (big % counter != 0 && small % counter != 0){
			counter--;
		}
		return counter;
	}
}
