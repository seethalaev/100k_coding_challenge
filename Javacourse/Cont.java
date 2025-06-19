package Javacourse;
//display the count of digits
public class Cont {
  public static void main(String[] args) {
    int count=0;
    int n=2349;

    while(n>0)
    {
         n=n/10;
        count++;
        System.out.println(count);
    }
  }  
}
