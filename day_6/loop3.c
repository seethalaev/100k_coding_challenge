#include <stdio.h>
#include<stdlib.h>
int main()
{
    int i,limit=5,j;
    for(i=1;i<=limit;i++)
        {
       // printf("inside first loop\n");
        for(j=1;j<=5;j++)
                {
                   // printf("inside second loop");
                      printf("%d",i); 
                }
             printf("\n");
        }      
} 