/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void get_account_balance();
void withdraw(int a);
void deposit_money(int b);

char name[50]="shilpa";
int acountblnce=12000;


int main()
{
  get_account_balance();
  withdraw(500);
  deposit_money(20);
  get_account_balance();
}


 void deposit_money(int b)
{
 acountblnce=acountblnce+b;
}