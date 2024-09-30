int main()
{
    int choice;
    printf("1 for facial \n2 for U cut \n3 for cleanup \n4 for hairspa \n");
    scanf("%d",&choice);
    switch(choice)
    {
    case 1:
    printf("you have selected facial"); 
    break;
    case 2:
    printf("you have selected U cut");
    break;
    case 3:
    printf("you have entered clen up");
    break;
    case 4:
    printf("you hve entered hairspa");
    break;
    default:
    printf("fool");
    }
}