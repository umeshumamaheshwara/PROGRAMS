package StaticProgram.Number;

import java.util.HashMap;
import java.util.Map;

public class Unique_Character 
{
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		String str = "programming";
		for( char ch :str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		}
		
	}
	

}
