package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=5;
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }
}}

