package DynamicProgram.Number;

import java.util.Scanner;
	
	public class ArmStrong {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a Number:");
			int no = sc.nextInt();
			int n = no;
			int copy = no;
			int sum = 0;
			int count = 0;
			while(n!=0)
			{
				n= n/10;
				count++;
			}
			while(no!=0)
			{
				int rem = no % 10;
				sum = sum + (int) Math.pow(rem, count);
				no = no / 10;
			}
			if(copy==sum)
			{
				System.out.println("ArmStrong Number..");
			}
			else {
				System.out.println("Not a armstrong Number..");
			}
		}

	}

