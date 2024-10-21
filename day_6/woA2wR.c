#include <stdio.h>
int call();
int main()
{
    int tone,k;
    printf("enter tone\n");
    scanf("%d",&tone);
    k=call();
    printf("dilaed %d\n",k);
}
int call()
{
    int dial;
    printf("dial tone\n");
    scanf("%d",&dial);
    return dial;   
}