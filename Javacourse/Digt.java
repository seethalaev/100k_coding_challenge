package Javacourse;

import java.util.Scanner;
//display digits
public class Digt {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
         int n=257;
        // sc=n.nextInt;   
       
        while(n>0)
        {
           int r=n%10;
           System.out.println(r);
           n=n/10;
        }
           }
           
    }

