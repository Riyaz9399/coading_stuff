#include<stdio.h>
#include<math.h>

int calculatesum(int num);

int main(){

     
    printf("sum = %d", calculatesum(123));
    return 0;
}

int calculatesum( int num){
    int sum = 0;
    int  sum1 = sum + num % 10;
     num = num / 10;

    return sum;
}