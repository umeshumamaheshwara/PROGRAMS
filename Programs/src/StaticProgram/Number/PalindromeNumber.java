package StaticProgram.Number;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int no = 153;
		int copy = no;
		int sum = 0;
		
		while(no!=0)
		{
			int rem = no % 10;
			sum = sum*10 + rem;
			no = no / 10;
			
		}
		System.out.println(sum);
		if(copy==sum)
		{
			System.out.println("It is a palindrome Number.");
		}
		else {
			System.out.println("It is not a palindrome Number.");
		}
	}

}
