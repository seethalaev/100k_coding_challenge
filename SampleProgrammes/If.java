package SampleProgrammes;

import java.util.Scanner;

public class If
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println(+a+" is greater");
        }
        else
        {
            System.out.println(+b+" is gtreater");
        }
    }
}
