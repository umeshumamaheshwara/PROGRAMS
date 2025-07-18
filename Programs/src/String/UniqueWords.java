package StaticProgram.String;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords
{
	public static void main(String[] args) 
	{
		Map<String, Integer>  map =  new HashMap<String, Integer>();
		String str =  "Java is a programming language and python is also Programming language";
		String [] s1 = str.toLowerCase().split(" ");
		for(String words : s1)
		{
			map.put(words, map.getOrDefault(words, 0)+1);
			
		}
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue()== 1)
			{
				System.out.println(entry.getKey());
			}
		}
		
		// -----------------or----------------
		
		for(String words : s1)
		{
			if(map.get(words)==1)
			{
				System.out.println(words);
			}
		}
		
	}

}
