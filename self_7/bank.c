#include <stdio.h>
void get_account_balance();
void withdraw(int a);
int deposit_money(int b);

char name[50]="shilpa";
int acountblnce=12000;


int main()
{
  get_account_balance();
  withdraw(500);
  deposit_money(10);
   get_account_balance();
}
void get_account_balance()
{
    printf("your account balance is %d\n",acountblnce);
}
void withdraw(int a)
{
    printf("Money withdrawn %d\n",a);
    acountblnce=acountblnce-a;
    printf("Account balance after money withdrwal %d\n",acountblnce);
}
 int deposit_money(int b)
{
  
   printf("Deposit money want to \n");
   scanf("%d",&b);
   acountblnce=acountblnce+b;
   return acountblnce;
}