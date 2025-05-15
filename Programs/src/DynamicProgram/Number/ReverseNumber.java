package DynamicProgram.Number;

import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int no  = sc.nextInt();
		int sum = 0;
		while(no!=0)
		{
			int rem = no % 10;
			sum = (sum*10) + rem;
			no = no /10;
			
		}
		System.out.println(sum);
	}

}
