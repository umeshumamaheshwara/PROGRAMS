package StaticProgram.Number;

public class LCM {
	public static void main(String[] args) 
	{
		
		int num1 = 36;
		int num2 = 60;
		
		int a = num1;
		int b = num2;
		
		while(num2!=0)
		{
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
			
		}
		int lcm = (a*b)/num1;
		
		System.out.println("LCM is"+ lcm );
		
		
		
	}

}
