package StaticProgram.Number;

public class DecimalToBinary {
	public static void main(String[] args) {
		int no  = 10;
	    String sum = "";
	    while(no!=0)
	    {
	    	int rem = no % 2;
	    	sum = sum + rem ;
	    	no =  no / 2;
	    }
	    System.out.println(sum);
	}

}
