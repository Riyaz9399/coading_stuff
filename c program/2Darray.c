#include<stdio.h>


// int main(){
//     int marks[2][3];
//      marks[0][0]= 98;
//      marks[0][1]= 98;
//      marks[0][2]= 23;
//      marks[1][0]= 67;
//      marks[1][1]= 68;
//      marks[1][2]= 89;

//      printf("%d",marks[0][0]);

//     return 0;
// }

int countodd(int arr[], int n);

int main(){
    int arr[]= { 1,2,3,4,5,6,7,8};

    printf("%d",countodd(arr,8));

    return 0;
}

int countodd(int arr[], int n){
    int count = 0;
    for (int i = 0 ; i <= n; i++){
        if (i % 2 != 0){
            count++;
        }
        //printf("%d", count);
    }
    //printf("%d",count);
    return count;
}