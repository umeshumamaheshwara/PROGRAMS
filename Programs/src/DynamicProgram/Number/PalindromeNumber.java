package DynamicProgram.Number;

import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		int no  = sc.nextInt();
		
		int copy = no;
		int sum = 0;
		
		while(no!=0)
		{
			int rem = no  % 10;
			sum = sum *10 + rem;
			no = no / 10;
		}
		System.out.println(sum);
		if(copy==sum)
		{
			System.out.println("It is a Plaindrome Number.");
		}
		else {
			System.out.println("It is not a Plaindrome Number.");
		}
		
		
		
	}

}
