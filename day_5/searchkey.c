#include <stdio.h>
#include <stdio.h>
int main()
{
  int i,limit,value[100],searchkey,flag=0;
  printf("enter limit");
  scanf("%d",&limit);
  printf("enter values");
  {
      for(i=0;i<limit;i++)
      scanf("%d",&value[i]);
  }
    printf("enter searchkey");
    scanf("%d",&searchkey);
    {
        for(i=0;i<limit;i++)
        {
            if(searchkey==value[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            printf("values found at position %d",i+1);
        }
        else
        {
            printf("values not found");
        }
    }
}
 
    
    