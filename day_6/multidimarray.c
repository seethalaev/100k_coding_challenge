#include <stdio.h>
int main()
{
    int i,j,values[3][3];
    printf("enter values");
     for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
            scanf("%d",&values[i][j]);
            }
        }
    
    printf("entered array is");
    
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
             printf("%d\t",values[i][j]);
        }
            printf("\n");
        }
}