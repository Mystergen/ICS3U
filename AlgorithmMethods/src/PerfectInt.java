
public class PerfectInt {

	
	public static void main(String[] args){
		
		for(int i = 1; i < 100; i++){
			if (mod(i)){
			System.out.println(i);
			System.out.printf("Factors: ",mod(i));
			}
		}
	}

	
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
