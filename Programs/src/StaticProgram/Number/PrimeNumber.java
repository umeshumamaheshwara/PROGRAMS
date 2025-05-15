package StaticProgram.Number;

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 5;
		boolean f = true;
		for(int i=2 ; i<=Math.sqrt(no); i++)
		{
			if(no % i == 0)
			{
			     f = false;
			     break;
			     
			}
			
		}
		if(f)
		{
			System.out.println("It is a prime Number:");
		}
		else {
			System.out.println("false");
		}
		
	}
	


}
