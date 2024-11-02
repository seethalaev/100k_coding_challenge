package Superr;

public class D extends A
 {
    D()
    {
        System.out.println("D IS A CONSTRUCTOR");
    }
    D(int v)
    {
        //super(150);
        System.out.println("Argument constructor of D");
    }

    
public static void main(String[] args) 
{
    D d=new D(100);
    
}}