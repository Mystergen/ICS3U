
public class PythagoremTrip {

	
	public static void main(String[] args){
		
		for(int i = 0, counter = 1; i < 100  && counter < 100; i++){
			if ( i == 99){
				counter++;
				i = 1;
			}
			double total = Math.pow(i, 2) + Math.pow(counter, 2);
			boolean o = false;
			if(pie(total,o) == true){
				System.out.println(i+ " + " + counter+ " = " + (int)total);
			}else if (o == false){
				//System.out.print("did not work");
			}
			
		}

		
	}
	/**
	 * finds out if c in the pythagorem therom is a perfect square.
	 * @param n is the c value
	 * @param o  outputs true of false if it is a perfect square or not
	 * @return returns if true or false, and if true, outputs calculation
	 */
	public static boolean pie(double n, boolean o){
		int x = (int)Math.sqrt(n);
		double check = Math.pow(x,2);
		if(check == n){
			return o = true;
		}else{
			return o = false;
		}
	}
	
}
