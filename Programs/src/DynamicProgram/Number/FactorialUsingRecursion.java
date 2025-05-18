package DynamicProgram.Number;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int no = sc.nextInt();
		int x =  fact(no);
		System.out.println(x);	
	}
	public static int fact(int no)
	{
		if(no<=1)
		{
			return no;
		}
		else 
		{
			return no * fact(no-1);
			
		}
		
	}


}
