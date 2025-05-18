package StaticProgram.Number;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String no  = "011";
		int  decimal  = 0;
		int base = 1;
		for(int i=no.length()-1 ; i>=0 ; i--)
		{
		    char bit =  no.charAt(i);
		    if(bit=='1')
		    {
		    	decimal = decimal + base;
		    }
		    base =  base * 2;
		}
		System.out.println(decimal);
	}

}
