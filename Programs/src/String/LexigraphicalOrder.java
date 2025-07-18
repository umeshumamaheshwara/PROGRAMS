package StaticProgram.String;

import java.util.Arrays;

public class LexigraphicalOrder 
{
	public static void main(String[] args)
	{
		String [] arr = {"mango","banana","orange","apple","jackfruit"};
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr.length-1-i ; j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	   System.out.println(Arrays.toString(arr));
		
	}

}
