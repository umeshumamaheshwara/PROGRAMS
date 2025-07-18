package StaticProgram.String;

public class Revesre_A_String 
{
	public static void main(String[] args) 
	{
		String str = "Java";
		String result = " ";
		for(int i=str.length()-1; i>=0 ; i--)
		{
			 result =  result + str.charAt(i);
		}
		System.out.println(result);
		
	}

}
