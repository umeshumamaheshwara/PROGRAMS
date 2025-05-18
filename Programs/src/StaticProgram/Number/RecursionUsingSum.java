package StaticProgram.Number;

public class RecursionUsingSum {
	public static void main(String[] args) {
	 System.out.println(sum(6));
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
