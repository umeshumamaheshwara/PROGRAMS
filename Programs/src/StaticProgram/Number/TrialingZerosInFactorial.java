package StaticProgram.Number;

public class TrialingZerosInFactorial 
{
	public static void main(String[] args) 
	{
		int no = 100;
		 int n = 100;  // example input
	        System.out.println("Trailing zeros in " + n + "! = " + countTrailingZeros(n));
	    }

	    public static int countTrailingZeros(int n) 
	    {
	        int count = 0;
	        for (int i = 5; i <= n; i = i * 5) 
	        {
	            count += n / i;
	        }
	        return count;
	    }
}


