#include <stdio.h>

int main()
{
   float num1,num2,num3,avg;
    printf("Enter numbers");
    scanf("%f%f%f",&num1,&num2,&num3);
    avg=(num1+num2+num3)/3;
    printf("avg is: %f",avg);
    return 0;
}