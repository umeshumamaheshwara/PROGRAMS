package StaticProgram.String;

public class Palindrome_Word {
	public static void main(String[] args)
	{
		String str = "My mom said to learn malayalam but i am from katak place it is gadag district";
		String [] s1 = str.split(" ");
		for(int i = 0 ; i<s1.length ; i++)
		{
			String word = s1[i];
			String result = "";
			for(int j = word.length()-1 ; j>=0 ; j--)
			{
				result =  result + word.charAt(j);
			}
			if(word.equalsIgnoreCase(result))
			{
				System.out.println("Palindrome Strings Are ------>" + word);
			}
		}
	}
}
