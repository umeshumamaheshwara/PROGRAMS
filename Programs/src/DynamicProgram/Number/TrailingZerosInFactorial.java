package DynamicProgram.Number;

import java.util.Scanner;

public class TrailingZerosInFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eter a Number:");
		int no  =  sc.nextInt();
		countTrailingZeros(no);
		
        System.out.println("Trailing zeros in " + no + "! = " + countTrailingZeros(no));
    }

    public static int countTrailingZeros(int n) 
    {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) 
        {
            count = count +  n / i;
        }
        return count;
 
		
	}

}
