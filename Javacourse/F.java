package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
       // Scanner sc=new Scanner(System.in);
       // System.out.println("enter limit");
      int n=2345;
      int i=0;
      int count=0;
      
      while(n>0)
      {
        n=n/10;
        count++;
      }
      System.out.println(count);
          }    }


