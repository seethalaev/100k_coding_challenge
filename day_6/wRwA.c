#include <stdio.h>
int sum(int a,int b,int c); //definition
int main()//main function creation
{
    int mark1,mark2,mark3;
    printf("enter mark1: ");
    scanf("%d",&mark1);
     printf("enter mark2: ");
    scanf("%d",&mark2);
     printf("enter mark3: ");
    scanf("%d",&mark3);
    int k=sum(mark1,mark2,mark3);//function call
    //printf("entered marks %d%d%d",mark1,mark2,mark3);
    printf("we get a value%d",k);
}
int sum(int a,int b,int c)//sum function creation
{
     int total=a+b+c;
    printf("mark total %d\n",total);
    return total;
}
