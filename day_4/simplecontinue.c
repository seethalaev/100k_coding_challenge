#include <stdio.h>
#include<stdlib.h>
int main()
{
    int i,j;
    {
        for(i=0;i<10;i++)
        {
           printf("hi ");
           if(i == 5)
           {
               continue;
           }
        printf("hello \n");
        }
        printf("finished");
    }
    return 0;
}