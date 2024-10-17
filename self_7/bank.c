#include <stdio.h>
void get_account_balance();
void withdraw(int a);

char name[50]="shilpa";
int acountblnce=12000;


int main()
{
  get_account_balance();
  withdraw(500);
}


void get_account_balance()
{
    printf("your account balance is %d\n",acountblnce);
}
void withdraw(int a)
{
    acountblnce=acountblnce-a;
    
}
