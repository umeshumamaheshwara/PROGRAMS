package StaticProgram.String;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
		String str = "Mam";
		String result = "";
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			result = result + str.charAt(i);
		}
		System.out.println(result);
		if(str.equals(result))
		{
			System.out.println("The given String is Palindrome");
		}
		else 
		{
			System.out.println("String is Not Palindrome");
		}
	}

}
