package Javacourse;

public class Disword {
    public static void main(String[] args) {
        int n=21100;
        int r=0;
        String str="";
        while(n>0)
        {
            r=n%10;
            n=n/10;
            str=str+r;
        }
         System.out.println(str);
         for(int i=str.length()-1;i>=0;i--)
         {
            char c=str.charAt(i);
            switch (c) {
                case '0':
                System.out.println("zero");
                break;

                case '1':
                System.out.println("one");
                break;

                case '2':
                System.out.println("two");
                break;

                  
            }
         }
    }
}
