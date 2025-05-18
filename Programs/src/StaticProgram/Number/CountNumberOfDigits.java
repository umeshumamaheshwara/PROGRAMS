package StaticProgram.Number;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		
		int no = 1534678;
		int count = 0;
		 while(no!=0)
		 {
			 no = no / 10;
			 count++;
		 }
		 System.out.println("Number of Digit present in the Number is: "+count);
	}

}
