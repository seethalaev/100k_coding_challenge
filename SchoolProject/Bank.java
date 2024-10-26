package SchoolProject;

import java.util.Scanner;

class Details
{
  String name;
  int acbal;
  int moneyadd;
  Scanner s=new Scanner(System.in);

  void AddaccountBalance()
  {
    System.out.println("Enter user name");
    name=s.nextLine();
    System.out.println("Enter accountbalance");
    acbal=s.nextInt();
  }

  void ShowaccountBalance()

{
   System.out.println("Name :"+name);
   System.out.println("Balance :"+acbal);
}

  void withDraw(int a)
  {
    acbal=acbal-a;
    System.out.println("after withdarw :"+acbal);
    s.nextInt();
  }
  void deposite(int moneyadd)
  {
    acbal=acbal+moneyadd;
    System.out.println("Deposite :"+moneyadd);
    //s.nextInt();
  }

}
public class Bank 
{
    public static void main(String[] args)
    {
        Details a=new Details();
        a.AddaccountBalance();
        a.ShowaccountBalance();
        a.withDraw(500);
        a.ShowaccountBalance();
        a.deposite(moneyadd);
        a.ShowaccountBalance();
}
}
