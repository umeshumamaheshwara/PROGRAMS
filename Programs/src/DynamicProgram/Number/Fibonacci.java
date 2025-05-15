package DynamicProgram.Number;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range:");
		int no =sc.nextInt();
		
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		for(int i=2 ; i<=10 ; i++)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println(f3);
	}

}
