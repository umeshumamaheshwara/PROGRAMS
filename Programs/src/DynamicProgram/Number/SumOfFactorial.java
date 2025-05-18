package DynamicProgram.Number;

import java.util.Scanner;

public class SumOfFactorial {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no = sc.nextInt();
		int fact = factorial(no);
		System.out.println("Factorial of a Number is:"+fact);
		System.out.println("Sum of a Factorial digits is:"+sum(fact));
		
	}
	public static int factorial(int no)
	{
		int fact = 1;
		for(int i=no ; i>=1 ; i--)
		{
			fact =  fact * i; 
		}
		return fact;
	}
	public static  int sum(int no)
	{
		int sum = 0;
		while(no!=0)
		{
			int rem = no % 10;
			sum = sum + rem;
			no = no /10;
		}
		return sum;
	}

}
