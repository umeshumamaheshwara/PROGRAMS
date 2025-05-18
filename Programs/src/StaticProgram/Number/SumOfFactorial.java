package StaticProgram.Number;

public class SumOfFactorial 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int fact = factorial(n);
		int x = sum(fact);
		
		System.out.println("Factoraila of a Number is:"+ fact);
		System.out.println("Sum of the factorial of the digits is:"+ x);
		
		
	}
	public static int factorial(int no)
	{
		int fact = 1;
		for(int i=no ; i>=1 ; i--)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static int sum(int no)
	{
		int sum = 0;
		while(no!=0)
		{
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		return sum;
		
	}
	

}
