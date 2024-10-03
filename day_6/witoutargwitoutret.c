void sum();
int main()//fn 1,main fn call first
{
   
    sum();
}
void sum()
{                                            //dclaration of 2 fn
    int num1,num2,sum;
    printf("enter 2 numbers\n");
    scanf("%d%d",&num1,&num2);
    sum=num1+num2;
    printf("result is  %d",sum);
}