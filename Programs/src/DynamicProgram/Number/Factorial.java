package DynamicProgram.Number;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int no = sc.nextInt();
		int mul =1 ;
		for(int i = no ; i>=1 ; i--)
		{
			mul = mul * i ;
		}
		System.out.println(mul);
	}

}

