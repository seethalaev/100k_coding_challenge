package Javacourse;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");  
        int n=sc.nextInt();
        int num=n;
        int r,rev=0;

        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(num==rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palidrome");
        }
    }
}
