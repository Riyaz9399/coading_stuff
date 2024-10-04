#include <stdio.h>
#include <math.h>

int main()
{
  /*    int marks;
  printf("enter your marks =");
  scanf("%d",&marks);
   
   if (marks < 30){
      printf(" C \n");
     }
     else if (marks >= 30 && marks <= 70){
       printf("B");
     }
     else if ( marks >=70 && marks <= 90){
      printf("A\n");
     }
    else {
     printf(" A+ \n");
  }

  int x = 2;
   if(x=0){
    printf("x is equal to one\n");
    printf("%d", x);
   }
   else {
    printf("x is not equal to one");
   }

   char ch;
   printf("enter a character :");
   scanf("%c",&ch);

   if (ch >= 'A' && ch <= 'Z'){
    printf("upper case\n");
   }
   else if (ch >= 'a' && ch <= 'z'){
    printf("lower case\n");
   }
   else {
    printf("not english");
   }    */

   
  /* for (int i = 10; i >=1 ; i--){
    printf("hello world! %d\n" , i);
   }
  int a=1;
   do{
    printf("hii guys\n");
    a++;
   }
   while(a<=5);

   int sakshi = 1;
   while(sakshi<= 5){
    printf("olla ghu kha kha tu \n");
    sakshi++;
   }*/

   /*int num ;
   int table;
   printf("enter the number of table =");
   scanf("%d",&num);
   for(int i =1; i <=10; i++){
  
    printf("%d \n", table=num*i);
   }*/
   /*int n;
   
   do {
    printf("enter a number =");
    scanf("%d",&n);
    printf("%d\n",n);
    if(n % 7 == 0){
      break;
    }
   }while(1);
   printf("Thank you !");
    
  for(int i = 1; i <= 5; i++){
     printf(" * ");
     printf("\n");
     for(int j =1; j<=5; j++){
      printf(" * ");
     }
  }
  

    int n ;
    printf("enter the table number :");
    scanf("%d",&n);

    for(int i = 1 ;i <= 10; i++){
      printf("%d \n",n * i );
    }*/


  //   'int  n ;

  //   do{
  //    printf("enter the value :");
  //    scanf("%d",&n);
  //    printf("%d", n);

  //    if(n % 7 == 0){
  //     break;
  //    }

  //   }while(1);

  //   printf("thank you !");

    // int n ;

    // printf("enter your number = ");
    // scanf("%d",&n);

    // for (int i = 10 ; i >= n; i--){
    //    printf("%d \n", n * i);
    // }

  //  int sum = 0 ;
  //  for ( int i = 5 ; i <= 50 ; i++){
  //   sum = sum + i;
  //  }
  //  printf("%d", sum);
    
    // for (int i = 1 ; i <= 5; i++){
    //   for (int j = 1 ; j<=4; j++){
    //     printf(" * ");
    //   }
    //   printf("\n");
    // }
    
   int n ;
   int flag = 0;
   printf("enter any number ");
   scanf("%d",&n);

   for( int i = 2; i <= n ; i++){
    if (n % i == 0){
      flag = 1;
      break ;
    }  
   }
   
   if (flag == 0){
    printf("prime number");
   }
   else {
    printf("non-prime number");
   }
  

  
  

    return 0;
}