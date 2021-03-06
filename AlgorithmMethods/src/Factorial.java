/**
 * MethodsOfAlgorithms
 * Uses algorithms in methods to solve problems
 * @author ethanzhou
 *April 3 2017
 */
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.util.Scanner;
public class Factorial {
	//static InputStreamReader isu = new InputStreamReader(System.in);
	//static BufferedReader br = new BufferedReader(isu);
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("What factorial number do you want to know");
		int x = fact(sc.nextInt());
		System.out.println(x);
	}
	/**
	 * find the factorial number that the person inputs
	 * @param x is the number the person inputs to the factorial method
	 * @return product is the factorial number from what number the person entered
	 */
	public static int fact (int x){
		if (x<0){
			return -1;
		}else if (x==0){
			return 1;
		}else{
			int product = x;
			while (x>1){
				product = product*(x-1);
				x--;
			}
			return product;
		}
	}
}
