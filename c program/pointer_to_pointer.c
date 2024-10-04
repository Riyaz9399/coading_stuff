#include<stdio.h>
#include<math.h>

int main(){

    float price = 100;
    float *ptr = &price;
    float **pptr = &ptr;


    printf(" **PPtr = %f", **pptr);

    return 0;
}