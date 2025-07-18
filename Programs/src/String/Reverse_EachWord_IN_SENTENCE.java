package StaticProgram.String;

public class Reverse_EachWord_IN_SENTENCE 
{
	public static void main(String[] args) 
	{
		String str = "Hi Hello How Are You";
		String [] s1 = str.split(" ");
		for(int i=0 ; i<s1.length ; i++)
		{
			String word = s1[i];
			String result = " ";
			for(int j=word.length()-1 ; j>=0 ; j--)
			{
				result = result + word.charAt(j);
			}
			System.out.println(result);
		}
		
	}
}
