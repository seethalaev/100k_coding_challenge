package Supeer;

public class D extends A
{
    void Display()
    {        
       super.Display();     //super with method
       
    }
    public static void main(String[] args) 
    {
        D d=new D();
        d.Display();
    }
}
