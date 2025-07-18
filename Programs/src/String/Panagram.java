package StaticProgram.String;

import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase().replaceAll(" ", "");
		TreeSet<Character> t1 = new TreeSet();
		for(int i=0 ; i<str.length() ; i++)
		{
			t1.add(str.charAt(i));
		}
		if(t1.size()==26)
		{
			System.out.println("Panagram");
		}
		else 
		{
			System.out.println("Not a Panagram String");
		}
		
	}

}
