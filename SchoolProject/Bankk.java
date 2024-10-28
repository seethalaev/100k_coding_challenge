package SchoolProject;

import java.util.Scanner;

class Details
{
  String name;
  int accountbalance;
  Scanner s=new Scanner(System.in);

  void AddUserDetails()
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
    System.out.println("after withdarw :"+ accountbalance);

  }
  void deposite()
  {
    System.out.println("Deposite :");
    int moneyadd=s.nextInt();
    accountbalance=accountbalance+moneyadd;
  }

}
public class Bankk 
{
    public static void main(String[] args)
    {
        Details a=new Details();
        a.AddUserDetails();
        a.ShowaccountBalance();
        a.withDraw(500);
        a.deposite();
        a.ShowaccountBalance();
}
}
