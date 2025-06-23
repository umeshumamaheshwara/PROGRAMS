package StaticProgram.Number;

public class First_poistive_Missing_No 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,5,6,7,8,9};
		
		int no = arr[arr.length-1];
		
		int sum = 0;
		
		int totalsum = no * (no+1)/2;
		
		for(int num:arr)
		{
			sum = sum + num;
		}
		System.out.println(totalsum-sum);
		
		
	}

}
