package SampleProgrammes;
import java.util.Scanner;

public class FunctinSampl {
    



    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int result = sum(num1, num2);
        System.out.println("Result is: " + result);

        
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
