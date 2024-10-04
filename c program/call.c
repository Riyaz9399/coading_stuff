#include<stdio.h>
#include<math.h>

// void square(int n);
// void _square(int *n);


// int main(){

    
//     int number = 4 ;
//     square(number);  
//     printf("number = %d\n", number);

//     _square(&number);
//     printf("number = %d\n", number);



//     return 0;
// }

// void square(int n ){ // call by value 
//     n = n * n;
//     printf(" square = %d \n" , n);
    
// }
// void _square(int *n ){ // call by reference
//     *n = (*n) * (*n);
//     printf(" square = %d \n" , *n);
    
// }


// void swap (int a ,int b);
// void _swap(int *a, int *b);

// int main(){
//     int x = 3, y = 5;
//     _swap (&x,&y);
//     printf("a = %d  & b = %d ", x,y );
    
//     return 0;
// }

// // call by value
// void swap(int a , int b ){
//  int t = a;
//  a = b;
//  b = t;
//  printf("a = %d & b = %d", a , b );

// }

// //call by reference
// void _swap(int *a, int *b){
//     int t = *a;
//     *a = *b;
//     *b = t;
//     printf("a = %d\n & b = %d\n", *a , *b );

// }

// void printaddress(int *n );

// int main(){
//     int n = 4;

//     printaddress(&n);
//     printf("address of n is = %u \n", &n);

// }

// void printaddress(int *n){
//  printf("address of n = %u\n",  &n);
// }

void dowork (int a, int b ,int *sum , int *pow , float *average);
int main(){
    int a = 5, b = 10;
    int sum , pow ;
    float  average;
    dowork (a , b , &sum , &pow ,&average);
    //printf("sum = %d pow = %d an d average = %f",sum, pow, average);

    printf("%d", sum);

  return 0;
}

void dowork (int a , int b , int *sum , int *pow, float *average){
    *sum =  a + b;
    *pow = a * b;
    *average = (a+b)/2;

}

 