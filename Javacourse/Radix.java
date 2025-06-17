package Javacourse;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args)
     {
        
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("enter number");
        num=sc.nextLine();

        if(num.matches("[0-1]+"))
        {
            System.out.println("binary radix");
        }
    }
    
}
