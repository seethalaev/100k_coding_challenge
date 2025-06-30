package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
       // Scanner sc=new Scanner(System.in);
      int n=153;
      int sum=0;
      int rev=0;
      while(n>0)
      {
        rev=n%10;
        System.out.println(rev);
        sum=sum+rev*rev*rev;
        System.out.println(sum);
        n=n/10;
      }
     
     }    }


