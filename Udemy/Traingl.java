package Udemy;

import java.util.Scanner;

public class Traingl 
{
public static void main (String args[])
{
    float l,b,traig;
    System.out.println("ENTER lng,br,hgt");
    Scanner sc=new Scanner(System.in);
    b=sc.nextFloat();
    l=sc.nextFloat();

    traig=b*l*0.5f;
    System.out.println("area"+traig);
}
}