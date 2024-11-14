#include <stdio.h>
void get_account_balance();
void withdraw(int a);
void deposit_money(int b);

char name[50]="shilpa";
int acountblnce=12000;

int main()
{
    int choice;
  do
  {
         printf("\noption 1 =check balance \noption 2 = money withdraw \noption 3 = money deposite \n");
         printf("enter the choice :\n");
         scanf("%d",&choice);
     
     if(choice==1)
     {
         get_account_balance();
     }
     else if(choice==2)
     {
        int m;
        printf("Cash to withdraw \n");
        scanf("%d",&m);
        withdraw(m); 
     }
     else if(choice==3)
     {
         int n;
         printf("Cash to add \n");
         scanf("%d",&n);
         deposit_money(n);
     }
     
  }while(choice!=0);
    
}

 void get_account_balance()
{
    printf("your account balance is %d\n",acountblnce);
}

void withdraw(int a)
{
    printf("Money withdrawn %d\n",a);
    acountblnce=acountblnce-a;
}

 void deposit_money(int b)
{
 acountblnce=acountblnce+b;
}
