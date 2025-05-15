package Udemy;

public class InDe 
{
    public static void main(String args[])
    {
        int x=5,y;
        y=x++; //y=++x -6,6
        System.out.println(x+" "+y);
        int a=4, b=3,z;
        z=2*a++ +3 *++b;
        System.out.println(z+" "+a);

    }
}
