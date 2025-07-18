package StaticProgram.String;

public class Reverse_Sentence {
	public static void main(String[] args) 
	{
		String str = "Hi Hello How Are You";
		String[] s1 = str.split(" ");
		String result ="";
        for(int i=s1.length-1 ; i>=0 ; i--)
        {
        	result = result + s1[i] + " ";
        
        }
        System.out.println(result);
      
    }
}
