
#include<stdio.h>
int sum();
int main()
{
    int k;
    k=sum();
    printf("sum is %d",k);
    return 0;
}
int sum()
{
    int a,b,sum;
    printf("enter 2 numbers\n");
    scanf("%d%d",&a,&b);
    sum=a+b;
    return sum;
}