#include <stdio.h>
#include<stdlib.h>
int main()
{
    int n=10,flag=0,i;
    for(i=2;i<n/2;i++)
    {
       if(n%i==0)
       {
           flag=1;
           break;
       }
    }
    if(flag==0)
    {
        printf("prime number");
    }
    else
    {
        printf("not a prime");
        
    }
}