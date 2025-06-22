package StaticProgram.Number;

import java.util.HashMap;

public class Unique_Array_Elements 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
		int arr[] = {1,2,3,4,5,6,2,2,4};
		for(int num: arr)
		{
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		System.out.println("Unique Array Elemnts.....");
		for(int num : arr)
		{
			if(map.get(num)==1)
			{
				System.out.println(num);
			}
		}
		
		
		
	}

}
