package Javacourse;

import java.util.Scanner;

public class Ap 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a,d,n");
        int a=sc.nextInt();
         int d=sc.nextInt();
         int n=sc.nextInt();
         int term=a;

         for(int i=0;i<n;i++)
         {
            System.out.print(term+",");
            term=term+d;
         }
        
    }
}
