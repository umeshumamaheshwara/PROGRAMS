package StaticProgram.Number;

public class FibonacciUsingRecursion {
	public static void main(String[] args) {
		System.out.println(fib(6));
		
	}
	public static int fib(int no)
	{
		if(no==0)
		{
			return 0;
		}
		else if(no==1 || no==2)
		{
			return 1;
		}
		else {
			return fib(no-1) + fib(no-2);
		}
	}

}
