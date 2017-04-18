import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrphanBlack {
	static InputStreamReader iso = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(iso);
	
	public static void main(String[] args) throws IOException{
		System.out.println("input dna");

		do{
			if(br.readLine().equals("a") || br.readLine().equals("t")){
				
			}else if(br.readLine().equals("g") || br.readLine().equals("c")){
				
			}
		}
		
		
		/*for(int i = 0; i < input.length(); i++){
			int counter = 0;
			int[] ans = new int[counter];
			if (input.equals("a") || input.equals("t")){
				ans[counter] = 0;
				counter++;
			}else if (input.equals("g") || input.equals("c")){
				ans[counter] = 1;
				counter++;
			}
		}
		System.out.print(ans[counter]);*/
	}
}
