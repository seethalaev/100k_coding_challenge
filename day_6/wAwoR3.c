#include <stdio.h>

void greeting(); // definition
int main() // main function creation
{
  printf("this is main function\n");
  greeting(25);
}

void greeting(int mark) // greeting function creation
{
    printf("good morning\n");
    printf("%d",mark);
}