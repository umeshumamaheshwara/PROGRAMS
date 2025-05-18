package StaticProgram.Number;

public class SumOfAllEvenNumbers1toN {
	public static void main(String[] args) 
	{
		int num = 10;
		int sum = 0;
		for(int i = 2 ; i<=num  ; i=i+2)
		{
			sum = sum + i;
		}
		System.err.println(sum);
		
	}

}
