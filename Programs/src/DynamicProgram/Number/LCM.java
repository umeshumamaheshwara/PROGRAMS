package DynamicProgram.Number;

import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENter 1st Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		int num2 = sc.nextInt();
		
		int a = num1;
		int b = num2;
		
		while(num2!=0)
		{
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		int lcm = (a*b)/num1;
		System.out.println("LCM is:"+lcm);
		
		
	}

}
