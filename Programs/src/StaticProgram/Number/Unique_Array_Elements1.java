package StaticProgram.Number;

import java.util.HashMap;
import java.util.Map;

public class Unique_Array_Elements1 {
	public static void main(String[] args) 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int arr[] = {1,2,3,4,5,6,2,2,4};
		for(int num: arr)
		{
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		System.out.println("Unique Array Elemnts.....");
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey()+ " ");
			}
		}
	}

}
