package Javacourse;

public class Arm {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int r;
        int m=n;

        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
            System.out.println(r);
            System.out.println(sum);

        }
    }
}
