#include<stdio.h>

int main(){

/*    for ( float i = 1.0; i <= 5.0; i++ )
    {
        printf("%f \n",i);
    }
    for (char ch = 'A'; ch <='Z';ch++)
    {
        printf("%c\n",ch);
    }
    
    int num =1;
    while (num <= 10)
    {
        printf("%d\n", num);
        num++;
    }

    int n ;
    printf("Enter your number = ");
    scanf("%d",&n);

    for (int i = 0 ; i <= n; i++){
        printf("%d \n", i);
    }*/
    
   /* int i = 0;

    do {
        printf("hello world \n");
        i++;

    }
    while (i <= 5);*/

    int n;
    printf("enter the number = ");
    scanf("%d" ,&n);

    int sum = 0;

    for (int i = 0, j = n ; i <= n && j>=i; i++, j--){
       sum = sum + i;
       printf("%d\n", j);
    }
    printf("%d \n", sum);

    

    return 0;
}