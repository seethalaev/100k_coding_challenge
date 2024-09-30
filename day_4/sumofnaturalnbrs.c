#include <stdio.h>
#include<stdlib.h>
int main()
{
    int i,sum=0,n;
    {
        printf("enter a limit\n");
        scanf("%d",&n);
        for(i=0;i<=n;i++)
        {
        sum=sum+i;
        }
        printf("sum=%d",sum);
   }
}