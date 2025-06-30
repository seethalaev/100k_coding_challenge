package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
       // Scanner sc=new Scanner(System.in);
      int n=153;
      int i=0;
      int r=1;
      int sum=0;
      int term=n;
      while(n>0)
      {
        r=n%10;
        System.out.println(r);
        sum=sum+r*r*r;
        n=n/10; 
      }
      System.out.println(sum);
      if(term==sum)
      {
        System.out.println("armstrong");
      }
      else{
        System.out.println("not armstrong");
      }
    }
     }    


