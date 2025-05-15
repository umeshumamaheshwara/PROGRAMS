package StaticProgram.Number;

public class Factorial {
	public static void main(String[] args) {
		
		int no = 5;
		int mul =1 ;
		for(int i = no ; i>=1 ; i--)
		{
			mul = mul * i ;
		}
		System.out.println(mul);
	}

}
