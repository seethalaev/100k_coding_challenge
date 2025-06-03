package Udemy;

public class Austrailtraffic implements Centraltraffic
{
   public static void main(String[] args) 
   {
      Centraltraffic a=new Austrailtraffic();
      a.Green();
      a.Red();
      a.Yellow();
      Austrailtraffic s=new Austrailtraffic();
      s.Study();
   } 
   public void Study()
   {
      System.out.println("study only");
   }
   public void Red()
   {
      System.out.println("Red for stop");
   }
   public void Green()
   {
      System.out.println("Green for go");
   }
   public void Yellow()
   {
      System.out.println("wait");
   }
}
