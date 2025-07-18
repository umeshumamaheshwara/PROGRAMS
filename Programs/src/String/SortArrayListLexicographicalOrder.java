package StaticProgram.String;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayListLexicographicalOrder 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("mango","banana","apple","jackfruit"));
		for(int i =0 ; i<a.size() ; i++)
		{
			for(int j = 0 ; j<a.size()-1-i ; j++)
			{
				if(a.get(j).compareTo(a.get(j+1))>0)
				{
					String temp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
			}
			
		}
		for(String arr : a)
		{
			System.out.println(arr);
		}

		
	}

}
