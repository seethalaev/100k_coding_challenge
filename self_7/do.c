int main()
{
    int choice;
    do
    {
    printf("option 1 = icecream\noption 2 = cake\n");
     printf("enter the choice :\n");
     scanf("%d",&choice);
     if(choice==1)
     {
         printf("you choose icecream\n");
     }
     else if(choice==2)
     {
         printf("you choose cake\n");
     }
     else
     {
        printf("invalid option \n");
     }
    }while(1);
}