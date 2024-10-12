#include <stdio.h>
#include<stdlib.h>
int main()
{
    int i,limit=4,j;
    for(i=0;i<limit;i++)
        {
        printf("inside first loop\n");
        for(j=0;j<i;j++)
                {
                    printf("inside second loop");
                      printf("*"); 
                }
             printf("\n");
        }      
}    
