#include<stdio.h>

// void printhii(int count);
// int main(){

//     printhii(10);
//     return 0;
// }
// void printhii(int count ){
//     if (count == 0){
//         return ;
//     }
//     printf("Hello world! \n");
//     printhii(count - 1 );
// }


// int sum( int n );

// int main(){
//     printf("sum is  = %d", sum(5));
//     return 0;
// }

// int sum (int n){
//     if(n == 1){
//         return 1;
//     }
//     int sumofn = sum(n - 1);
//     int sumn = sumofn + n;
//     return sumn;
// }


// int factorial ( int n);

// int main(){

//     printf("The factorial is = %d", factorial(4));

//     return 0;
// }


// int factorial(int n ){
//     if(n == 0){
//         return 1;
//     }
//     int fact = factorial(n-1);
//     int fact1 = fact * n;
//     return fact1;

// }
                        // faranite to celsius 
// float converttemp(float celsius);

// int main(){
//     float far = converttemp(37);
//     printf("  far = %f", far );


//     return 0;
// }

// float converttemp (float celsius){
//     float far = celsius * (9.0/5.0) + 32;
//     return far;

// }      
              // percentage 


//  int  calculatepercentage(int math , int science , int sanskrit);


//  int main(){
//     int science = 98;
//     int math = 95 ;
//     int sanskrit = 99;
    
//     printf("percentage = %d", calculatepercentage(science,math,sanskrit));

//     return 0;
//  }             

//  int calculatepercentage(int math , int science , int sanskrit){
//     return ((science + math + sanskrit) / 3 );
//  }


int fibonacci (int n );

int main(){
    fibonacci (4);


    return 0;
}

int fibonacci(int n ){
    if (n == 0){
        return 0;
    }

    if( n == 1){
        return 1;
    }
    int fibo1 = fibonacci (n - 1);
    int fibo2 = fibonacci (n - 2);
    int fibo = fibo1 + fibo2 ;
    return fibo;

}