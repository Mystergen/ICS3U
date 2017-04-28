/**
 * PerfectInteger
 * Finds out if a number between 1 and 1000 is a perfect number
 * @author ethanzhou
 *April 24 2017
 */
public class PerfectInt {

	
	public static void main(String[] args){
		
		for(int i = 1; i < 1000; i++){
			if (mod(i)){
			System.out.println(i);
			System.out.printf("Factors: ",mod(i));
			}
		}
	}

	/**
	 * Calculations for detecting a perfect number
	 * @param num is the integer
	 * @return it returns a boolean saying that the integer is a perfect number, else doesn't return it
	 */
	public static boolean mod (int num){
		int sum = 0;

        for(int i=1;i<num;i++)
        {
            if (num % i == 0)
            {
                sum+=i;
            }
        }
        if(num==sum)
        {
        for(int i=1;i<num;i++)
        {
            if (num % i == 0)
            {
                System.out.print(i+" ");
            }
        }


        }
        return sum==num;
        
	}
}
