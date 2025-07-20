package StaticProgram.Number;

import java.util.Arrays;

public class Merge_Two_Unsorted_Array 
{
	public static void main(String[] args) 
	{
		int [] arr1 = {4,2,3,5};
		int [] arr2 = {1,4,6,7};
		int [] temp = new int[arr1.length + arr2.length];
		int j = 0 ;
		for(int i =0 ; i<arr1.length ; i++)
		{
			temp [j++] = arr1[i];
			
		}
		for(int i=0 ; i<arr2.length ; i++)
		{
			temp [j++] = arr2[i];
			
		}
		System.out.println(Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
		//--------> or <----------------------
		
        System.arraycopy(arr1, 0, temp, 0, arr1.length);


        System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);

        System.out.println("Before Sorting: " + Arrays.toString(temp));
	}

}
