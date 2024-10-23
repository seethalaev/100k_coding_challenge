package Twoclass;

public class Hello {
    
        public static void main(String[] args)
    {
        Sample s1=new Sample();
        Sample s2=new Sample();

        s1.num1=20;
        s1.num2=30;
        s2.num1=40;
        s2.num2=50;
        System.out.println("s1- a :"+s1.num1+"s2- a :"+s2.num1+"s1- b:"+s1.num2+"s2- b:"+s2.num2);
    }
}