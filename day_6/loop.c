#include <stdio.h>
#include<stdlib.h>
int main()
{
    for(int i=1;i<5;i++)
    {
        printf("inside first loop ");
        for(int j=1;j<i;j++)
            {
            printf("inside second loop ");
            printf("*");
            }
        printf("\n");
    }
}