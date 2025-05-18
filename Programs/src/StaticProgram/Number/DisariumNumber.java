package StaticProgram.Number;

public class DisariumNumber {
	public static void main(String[] args) {
		int no  = 153;
		int n = no  ;
		int copy = no ;
		int count = 0;
		int sum = 0;
		
		while(n!=0)
		{
			n =  n /10;
			count++;
		}
		while(no!=0)
		{
			int rem = no % 10;
			sum = sum + (int) Math.pow(rem, count);
			no  = no / 10;
			count--;
		}
		if(copy==sum)
		{
			System.out.println("Desarium Number.");
		}
		else
		{
			System.out.println("Not a Disarium Number.");
		}
	}

}
