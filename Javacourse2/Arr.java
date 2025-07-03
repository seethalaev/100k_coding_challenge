package Javacourse2;

public class Arr {
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int c[];
        c=new int[10];
        int []D=new int[10];
        for(int x:B)
        {
            System.out.println(x);
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]);
        }
    }
}
