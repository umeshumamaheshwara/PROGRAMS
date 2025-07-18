package StaticProgram.String;

public class Count_NumberOf_Words 
{
	public static void main(String[] args) 
	{
		String str = "Hi Hello How are You";
		String [] s1 = str.split(" ");
		//System.out.println(s1.length);        // we can directly find like this.
		int count = 0;
		String result = " ";
		for(int i=0 ; i<s1.length ; i++)
		{
			result = result + s1[i];
			count++;
			
		}
		System.out.println(count);
	
	}

}
