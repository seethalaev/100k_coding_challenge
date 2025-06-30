package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
       
        int n=325;
        int r=0;
        int rev=0;
        while(n>0)
        {
            r=n%10;                      //5   2     3
            System.out.println(r);       //
            n=n/10;                      //32   3    0
            System.out.println(n);       //
            rev=r+rev*10;                //5    52   3+520
            System.out.println(rev);     //

           
        }
    }
    }
        


