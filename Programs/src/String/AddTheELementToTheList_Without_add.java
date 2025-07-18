package StaticProgram.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTheELementToTheList_Without_add 
{
	public static void main(String[] args) 
	{
		List a  =  new ArrayList(Arrays.asList(1,true,false,null,"java",0.32,'A'));
		System.out.println(a.toString());
		
		for(Object arr : a)
		{
			System.out.println(arr);
		}
		
	}

}
