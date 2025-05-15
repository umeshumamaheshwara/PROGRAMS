package StaticProgram.Number;

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;

        // Print first two numbers manually
        System.out.println(f1); // Position 1
        System.out.println(f2); // Position 2

        for (int i = 2; i <= 10; i++) 
        { // Start from position 3 to 10
            f3 = f1 + f2;
            System.out.println(f3); // Print the current Fibonacci number
            f1 = f2;
            f2 = f3;
        }
    }
}
