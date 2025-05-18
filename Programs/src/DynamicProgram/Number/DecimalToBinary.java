package DynamicProgram.Number;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		int no  = sc.nextInt();
		String res = "";
		while(no!=0)
		{
			int rem = no % 2;
			res = res + rem;
			no  = no / 2;
		}
		System.out.println(res);
	}

}
