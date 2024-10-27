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
    s.nextInt();
  }
  void deposite(int moneyadd)
  {
    accountbalance=accountbalance+moneyadd;
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
