package DynamicProgram.Number;

import java.util.Scanner;

public class RecursionSum {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int no = sc.nextInt();
		System.out.println(sum(no));
	}
	public static int sum(int no)
	{
		if(no<=1)
		{
			return no;
		}
		else {
			return no + sum(no-1);
		}
	}

}
