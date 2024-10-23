package TwoClass3;

public class Sample 
{
  public static void main(String args[]) 
  {
    int num1=100;
    int num2=200;

    int num3=400;
    int num4=800;

    Sum s=new Sum();
    s.calculateSum(num1, num2);
    s.displaySum();
    s.calculateSum(num3, num4);
    s.displaySum();
    
  }   
}
