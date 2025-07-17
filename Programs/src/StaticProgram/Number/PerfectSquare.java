package StaticProgram.Number;

public class PerfectSquare 
{
	public static void main(String[] args) 
	{
		int no  = 100;
		int sqrt = (int) Math.sqrt(no);
		if(no == sqrt*sqrt)
		{
			System.out.println("Perfect Square");
		}
		else {
			
			System.out.println("It is not a Perfect Square...");
		}
		
	}

}
