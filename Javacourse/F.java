package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            int mu=i*n;
            

            System.out.println(i+"*"+n+"="+mu);
        }
}}

