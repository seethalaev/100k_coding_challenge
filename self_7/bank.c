#include <stdio.h>
void get_account_balance();

char name[50]="shilpa";
int acountblnce=12000;

int main()
{
  get_account_balance();
}

void get_account_balance()
{
    printf("your account balance is %d",acountblnce);
}


#include <stdio.h>
void get_account_balance();
void withdraw_money(int money);

char name[50]="shilpa";
int acountblnce=12000;

int main()
{
  get_account_balance();
  withdraw_money(500);
}

void get_account_balance()
{
    printf("your account balance is %d\n",acountblnce);
}
void withdraw_money(int money)
{
    money=acountblnce-500;
}