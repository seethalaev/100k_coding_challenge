package Udemy;

public class Palindrom 
{
    public static void main(String[] args) 
    {
        String s="malayalam";
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
        t=t+ s.charAt(i);
        }
        System.out.println(t);
            
    if(s.equals(t))
    {
            System.out.println("palindrome");
    }
    else{
        System.out.println("no palindrome");
    }

}}
