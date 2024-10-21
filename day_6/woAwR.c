#include<conio.h>
#include<stdio.h>
int main()
{
    int choice;
    printf("Dial your choice :");
    scanf("%d",&choice);
    int k=call();
   printf("you have selected%d",k);
}
 int call()
 {
     int tone;
     printf("enter your ring tone ");
     scanf("%d",&tone);
     printf("nokia tune\n");
     return tone;
 }
