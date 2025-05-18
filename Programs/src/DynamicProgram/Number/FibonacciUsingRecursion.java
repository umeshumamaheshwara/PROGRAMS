package DynamicProgram.Number;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int n =  sc.nextInt();
		System.out.println(fib(n));
	}
	public static int fib(int no)
	{
		if(no==0)
		{
			return 0;
		}
		else if(no==1 || no==2)
		{
			return 1;
		}
		else {
			return fib(no-1) + fib(no-2);
		}
		
	}

}
