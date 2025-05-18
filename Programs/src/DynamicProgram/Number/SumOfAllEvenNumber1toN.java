package DynamicProgram.Number;

import java.util.Scanner;
public class SumOfAllEvenNumber1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Nth Number:");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=2 ; i<=num ; i=i+2)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
		
	}

}
