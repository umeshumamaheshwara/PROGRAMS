package StaticProgram.Number;

public class Range_Of_PerfectSquare {
	public static void main(String[] args) {
		for(int i=1; i<=200; i++)
		{
			int no = i;
			int sqrt = (int) Math.sqrt(no);
			if(no == (sqrt*sqrt))
			{
				System.out.println(sqrt + "--->Is perfect square");
				
			}
			
		}
	
	}

}
