package Javacourse;

import java.util.Scanner;

public class F 
{
    public static void main(String args[])
    {

        int r=0;
        String str="";
        int n=159;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            str=str+r;
            
        }System.out.println(str);
        char c;
         for(int i=str.length()-1;i>=0;i--)
         {
            c=str.charAt(i);
            switch (c) {
                case '9':
                    System.out.println("nine");
                    break;
                    case '1':
                    System.out.println("one");
                    break;
                    case '5':
                    System.out.println("five");
                    break;
            
                default:
                    break;
            }
         }
        }}
    
    
        


