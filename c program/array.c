#include<stdio.h>
#include<math.h>

//int main(){

//     int marks[3] ;
//     printf("enter math marks = ");
//     scanf("%d",&marks[0]);
    
//     printf("enter chemistery marks = ");
//     scanf("%d",&marks[1]);
    
//     printf("enter science marks = ");
//     scanf("%d",&marks[2]);
    

//     for(int i =0;i < 3; i++){
//      printf("%d \n",marks[i]);
//     }


    // for (int i = 0; i <= 5; i++)
    // {
    //     printf("enter your araay number = ");
    //     scanf("%d",&marks[i]);
    // }

    // for()
//     return 0;
// }

//  int main(){
//     float price[] ={ 100,200,300};
   
    
//     printf("total price 1 = %f\n", price[0]+(0.18*price[0]));
//     printf("total price 2 = %f\n", price[1]+(0.18*price[1]));
//     printf("total price 3 = %f\n", price[2]+(0.18*price[2]));
//     return 0;
//  }
int main(){
//     float price = 100.00;
//     float *ptr = &price;
//     printf("ptr = %u\n",ptr);
//     ptr++;
//     printf("ptr = %u\n", ptr);
//     ptr--;
//     printf("ptr = %u\n",ptr);
//     char star = '*';
//     char *pptr = &star;
    
//     printf("ptr = %u\n",pptr);
//     pptr++;
//     printf("ptr = %u\n", pptr);
//     pptr--;
//     printf("ptr = %u\n",pptr);
//     int age = 22; 
//     int _age = '*';

//     int *ptr = &age;
//     int *_ptr = &_age;

//     printf("%u \n %u\n difference = %u\n", ptr , _ptr, ptr - _ptr);
//     _ptr = &age; 
//     printf("compresion = %u\n",ptr == _ptr);
//    return 0;
// }


    int aadhar [5];
     

     int *ptr = &aadhar[0];
     //input 
     for(int i = 0; i < 5 ; i++){
        printf("[%d] index  ", i);
        scanf(" %d", &aadhar[i]);
     }
    // output
    for (int i = 0; i < 5; i++){
        printf("%d index= %d \n ",i, aadhar[i] );
    }


return 0;
}
