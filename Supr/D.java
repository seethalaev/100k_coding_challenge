package Supr;

public class D extends A 
{
    int a=20;
    
    void Display()
    {        
       
        System.out.println("Wlcome to D");
    }
    void BaseDisplay()
    {
        super.Display(); 
    }
    public static void main(String[] args) 
    {
        D d=new D();
         d.Display();//method overriding
         //d.BaseDisplay();
    }
}
