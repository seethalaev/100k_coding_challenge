package Supeer;

public class D extends A
{
    void Display()
     {        
       super.Display();     //super with method
       super.a=10;         //super with var
       int c=a+super.a;
       System.out.println(c);
    }
    public static void main(String[] args) 
    {
        
    }
}
