package Varbls;

public class Sample
{
int a=100,b=300;//global variable can access to all fns
Sample(int a,int b)//local variable in constructor
{
     a=this.a;             //this represent glbal object for this cls(this.a=100,a=int a)
     this.b=b;
   System.out.println(this.a+" "+this.b);
}}
