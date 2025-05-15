package DynamicProgram.Number;

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int no = sc.nextInt();
		boolean f = true;
		for(int i =  2 ; i<= Math.sqrt(no) ; i++)
		{
		   if(no  % i == 0)
		   {
			   f = false ;
			   break;
			   
		   }
		}
		if(f)
		{
		  System.out.println("It is a Prime Number:");
		}
		else {
			System.out.println("it is not a prime:");
		}
		
	}
	
	

}
