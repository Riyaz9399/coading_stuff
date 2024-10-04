#include<stdio.h>
#include<math.h>
//function decleration/prototype
// void printtable(int n);   //parameter
// int main(){
//     int n ;
//     printf("enter the value of n =");
//     scanf("%d",&n);
//     printtable(n);     //argument//actual parameter
//     return 0;
// }
//     void printtable (int n){     //parameter
//         for(int i = 1; i <= 10; i++){
//         printf( "%d \n",n*i);
//         }
//         return 0;
//     }
//     void calculateprice (float value);
//     int main(){
//         float value = 100;
//         calculateprice(value);
//         printf("value is = %f\n",value);
//         return 0;

//     }
//     void calculateprice(float value){
//         value = value + (0.18 * value);
//         printf("%f \n",value);
//     }

//     float square (float side);
//     float circle(float radius);
//     float rectangle(float a, float b);

//     int main(){

//     float a = 5.0;
//     float b = 10.0;

//         printf(" area is :=%f", rectangle(a , b));
//         return 0;
//     }

//     float square(float side){
//         return side * side ;
//     }

//     float rectangle(float a , float b){
//         return a*b;
//     }

//     float circle(float radius ){
//         return 3.14 * radius * radius ;
//     }
// // **recursion**//
//     void printhello(int count); 
//     int main(){
        
//         printhello(12);
//         return 0;
//     }

    // void printhello(int count){
    //     if (count == 0){
    //         return;
    //     }
    //     printf("hello world!\n");
    //     printhello(count - 1);
        
    // }

    // int fact(int n);

    // int main(){
    //     printf("sum is = %d", fact(5));
    //     return 0;
    // }

    // //recursive function //
    // int fact(int n){
    //     if (n == 1){
    //         return 1;
    //     }
    //     int sumNn1 = fact(n - 1); //sum of 1 to n
    //     int sumN = sumNn1 * n ; 

    // }

    // void printhello();
    // void printgoodbye();

    // int main(){
    //     printhello();
    //     printgoodbye();

    //     return 0;
    // }


    // void printhello(){
    //     printf("hello  world \n");
    //     printf("my name is sakshi\n");

    // }

    // void printgoodbye(){
    //     printf("good bye \n");
    // }


    // void india();
    // void french();

    // int main(){

    //     char ch ;
    //     printf("enter character f and i : ");
    //     scanf("%c",&ch);

    //     if (ch == 'f'){
    //         french();
    //     }
    //     else  {
    //         india();
    //     }
    //     india();


    //     return 0;
    // }

    // void india(){
    //     printf("namaste !\n");
    //     printf("INDIA ! \n");
    // }

    // void french(){
    //     printf("bonjour ! \n");
    //     printf("FRENCH !\n"); 
    // }

    // int sum (int a, int b);  // parameter // formal parameter
    // void printtable(int n );

    // int main(){
    //     int a , b;
    //     int n ;
    //     printf("enter the value of a = ");
    //     scanf("%d", &a);
    //     printf("enter the value of b = ");
    //     scanf("%d",&b);
    //     printf("enter the value of n = ");
    //     scanf("%d",&n);

    //     int s = sum (a, b);
    //     printf("sum = %d",s);

    //     printtable(n);  // argument // actual parameter

    // }

    // int sum (int x , int y){
    //     return x + y ;
    // }

    // void printtable(int n){// parameter //formal paramater 
    //     for (int i = 1 ; i <= 10 ; i++){
    //         printf("Table = %d\n" ,n * i);
    //     }
    // }

    // void calculateprice(float value);


    // int main(){

    //     float value = 100.0;
    //     calculateprice(value);
    //     printf("final value is = %f ", value);

    //     return 0;

    // }

    // void calculateprice(float value){
    //     value = value + (0.18 * value );
    //     printf("final price is : %f",value);
    // }

    float squarearea (float side);
    float circlearea (float rad);
    float rectanglearea (float a , float b );

    int main(){

        float a = 5.0;
        float b = 10.0;
        printf ("area is = %f", rectanglearea(a , b));

        
        return 0;
    }

    float squarearea (float side){
        return side *side ;
    }

    float circlearea (float rad){
        return  3.14 * rad * rad;
    }

    float rectanglearea (float a , float b){
        return a * b;
    }