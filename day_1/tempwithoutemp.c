#include <stdio.h>
#include<stdlib.h>

int main()
{
    int a=20;int b=30;
    a=a+b;//20+30=50   a=30,b=20
    b=a-b;//50-30     b=20,a=50-30
    a=a-b;
    
    
    printf("%d %d",a,b);
    
}