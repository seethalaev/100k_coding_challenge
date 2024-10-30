package Varbls;

public class Sample
{
int a=100,b=300;//global variable
Sample(int a,int b)//local variable
{
     a=this.a;
     this.b=b;
   System.out.println(this.a+" "+this.b);
}}
