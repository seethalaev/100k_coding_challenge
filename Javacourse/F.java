package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
       int n=32523;
       int r=0;
       int rev=0;
       int m=n;
       while(n>0)
    
       {
        r=n%10;         //
        n=n/10;
        System.out.println(r);
        rev=r+rev*10;
       }

        if(rev==m)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("noooo");
        }
       }   
        }
    
    
        


