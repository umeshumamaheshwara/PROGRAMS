package StaticProgram.String;

public class Count_Number_Of_Character_IN_EachWORD 
{
    public static void main(String[] args) 
    {
		String str = "Hi Hello How Are You";
		String [] s1 = str.split(" ");
		for(int i=0 ; i< s1.length ; i++)
		{
			System.out.println(s1[i] + "-->"+ "Number Of Character In the  Word Is:" + s1[i].length());
		}
	}
}
