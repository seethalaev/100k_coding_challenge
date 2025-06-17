package Javacourse;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args)
     {
        //else if ladder 
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("enter number");
        num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("binary radix=2");
        }
        else if(num.matches("[0-7]+"))
            {
                 System.out.println("octal radix=8");
            }
           else if(num.matches("[0-9]+"))
            {
                 System.out.println("Decimal radix=10");
            }
            else if(num.matches("[0-9AF]+"))
            {
                 System.out.println("hexa decimal=16");
            }
           else
           {
            System.out.println("not a number");
           }
           
        }
    }
    

