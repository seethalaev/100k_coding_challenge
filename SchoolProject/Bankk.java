package SchoolProject;

import java.util.Scanner;

class Details
{
  String name;
  int accountbalance;
  int moneyadd;
  Scanner s=new Scanner(System.in);

  void AddaccountBalance()
  {
    System.out.println("Enter user name");
    name=s.nextLine();
    System.out.println("Enter accountbalance");
    accountbalance=s.nextInt();
  }

  void ShowaccountBalance()

{
   System.out.println("Name :"+name);
   System.out.println("Balance :"+accountbalance);
}

  void withDraw(int a)
  {
    accountbalance=accountbalance-a;
    System.out.println("after withdarw :"+accountbalance);
   //s.nextInt();
  }
  void deposite()
  {
    System.out.println("Deposite :"+moneyadd);
    accountbalance=accountbalance+moneyadd;
   // s.nextInt();

  }

}
public class Bankk 
{
    public static void main(String[] args)
    {
        Details a=new Details();
        a.AddaccountBalance();
        a.ShowaccountBalance();
        a.withDraw(500);
        a.deposite();
        a.ShowaccountBalance();
}
}
