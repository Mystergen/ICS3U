
import java.util.Scanner;

/**
 * GameOfLife
 * Demonstrates the game of life multiplying and and dying (conway or something created game, still don't understand it myself that well, but i kinda have it)
 * @author ethanzhou
 *April 24 2017
 */
public class Life {
	static Scanner br = new Scanner(System.in);
	static int[][] field = new int[20][20];
	static int i;
	static int n;
	static boolean k = true;
	
	public static void main(String[] args){
		do{
		if (n == 0){	
			for(i = 0; i < 20; i++){
				for(n = 0; n < 20; n++){
					System.out.print(field[i][n] = 0);
				}
				System.out.println();
			}
			start();
		}else{
			//start();
			board();
			//born();
		}
		}while(k == true);
	}
	
	
	/**
	 * This method gets input from user for which index they want to input a 1 into
	 */
	public static void start(){// making a method void prevents you from needing to return, so you could just call it when you need it to do something
		System.out.println("How many inputs do you want");
		int time = 0;
		int track = br.nextInt();
		do{
		System.out.println("please input coordiantes from 0 - 20");
		field[br.nextInt()][br.nextInt()] = 1;
		time++;
		}while(time < track);
		
	}
	
	
	/**
	 * This method creates the 2-D array that is able to access and keeps going through each index of the array when called.
	 * It calls the rules to update the new 2-D array and then prints it
	 */
	public static void board(){
		for(i = 0; i < 20; i++){
			for(n = 0; n < 20; n++){
				System.out.print(field[i][n]);
				cellCheck(field[i][n]);
				//born();
			}
			System.out.println();
		}
		System.out.println("do you want to move to next gen (true/false)");
		k = br.nextBoolean();
	}
	
	
	/**
	 * this method is the rules for the game of life
	 * @param cell is the index for the 2-D array that is meant for the board
	 * @return returns the new 2-D array that has went threw the rules
	 */
	public static int cellCheck(int cell){
		for(int h = 1; h < i - 1; h++){
			for(int g = 1; g < n -1; g++){
				
				int neigh = 0;
				for(int k = -1; k <= 1; k++){
					for(int l = -1;  l <= 1; l++){
						neigh += field[h +k][g +l];
					}
				}	
				
				neigh -= field[i][n];
				if(field[i][n] == 1 && neigh < 2){
					field[i][n] = 0;
					//System.out.print("hi"); used this line of code to make sure this if statement is being read
				}else if(field[i][n] == 1 && neigh > 3){
					field[i][n] = 0;
				}else if(field[i][n] == 0 && neigh == 3){
					field[i][n] = 1;
				}else if(field[i][n] == 1 && neigh == 3){
					field[i][n] = 1;
					//System.out.print("Input 1 in coordinates 1-20");
					//field[i][n] = field[br.nextInt()][br.nextInt()];
					//System.out.println("input coordinates for brith");
					//field[br.nextInt()][br.nextInt()];
					//note there is a problem with brith, need to understand what you are supposed to do with the birth
				}else if (field[i][n] == 1 && neigh == 2){
					field[i][n] = 1;
				}
				else{
					field[i][n] = field[i][n];
				}
				/*if (field[i][n] == 1 && neigh ==3){
					System.out.("input coordinates between 1-20");
					field[i][n] = field[br.nextInt()][br.nextInt()] = 1;
				}*/
			}
		}
		
	
		//need to take out "|" because it doesn't work as an or (no longer a problem)
	
		return field[i][n];
	}
	
	public static void born(){
		for(int h = 0; h < i - 1; h++){
			for(int g = 0; g < n -1; g++){
				
				int neigh = 0;
				for(int k = 0; k <= 1; k++){
					for(int l = 0;  l <= 1; l++){
						neigh += field[h +k][g +l];
					}
				}	
				neigh -= field[i][n];
		for(i = 0; i < 20; i++){
			for(n = 0; n < 20; n++){
				if (field[i][n] == 1 && neigh == 3){
					System.out.print("input born coordinates");
					field[br.nextInt()][br.nextInt()] = 1;
				}
			}
		}
	}
		}
	}
}
