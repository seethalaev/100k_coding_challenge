#include <stdio.h>
#include<stdlib.h>
int main()
{
    int num1,num2,result,choice;
    printf("enter 2 number\n");
    scanf("%d%d",&num1,&num2);
    printf("1 for addition \n2 for subtraction \n3 for multiplication \n4 for division \n");
    printf("enter your choice");
    scanf("%d",&choice);

    if(choice==1)
    {
        result=num1+num2;
        printf("result is=%d",result);
    }
    else if(choice==2)
    {
        result=num1-num2;
        printf("result is=%d",result);
    }
    else if(choice==3)
    {
        result=num1*num2;
        printf("result is=%d",result);
    }
    else if(choice==4)
    {
        result=num1/num2;
        printf("result is=%d",result);
    }
    else
    {
        printf("fool");
    }
}
    