package StaticProgram.Number;

public class SumOfAllNaturalNum {
	public static void main(String[] args) {
		
		int num =  10;
		int sum = 0 ;
		for(int i =  1 ; i<= num ; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of all Natural Numbers:"+sum);
	}

}
