/**
 * LargestNumberDetector
 * Finds the largest number in an array
 * @author ethanzhou
 *
 */
import java.util.Scanner;
public class LargestNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("input the amount of numbers you want to be scanned");
		
		int input = (sc.nextInt());
		int[] array = new int[input];
		System.out.println("Please input numbers, and the largest number will be found");
		for (int i = 0; i < input; i++){
			array[i] = sc.nextInt();
		}
		System.out.println(largestNum(array));
	}
	/**
	 * Finds the largest number in the list of digits inputed
	 * @param array is an array of the inputed numbers
	 * @return returns the largest found number in the list
	 */
	public static int largestNum (int[]array){
		int largestNumber = array[0];
		for (int i = 1;i < array.length; i++){
			if (array[i] > largestNumber){
				largestNumber = i;
			}
		}
		return largestNumber;
	}
}
