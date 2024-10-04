// check prime no or not using pointer 
#include <iostream>
using namespace std;

int main(){
    /*int n;
    cin >> n;

    int fact = 1;

    int *ptr = &n ;
    for (int i = 2;i <= *ptr;i++){
        fact = fact * i;
    }
    cout << fact ;*/

    //Input
   /* int n;
    cin >> n ;

    bool isprime = true;

    // pointer 

    int *ptr = &n;

    if(*ptr == 2){

        goto end;
    }
    else {

        for(int i = 2; i < *ptr; i++){
            
            if (*ptr % i == 0){
                isprime = false;
                break;
            }
        }
    }
    end :
    if (isprime == true){
        cout<< "prime ";
    }
    else {
        cout<<"not prime!";
    }*/


    //pointer to pointer 

     int range;
     cin >> range;

     int n = 2;
     int *ptr = &n;
     

     for (*ptr ;*ptr <= range ; *ptr +=1){

        int isprime = true;
        if (*ptr == 2){
            goto end;
        }

        else{
            for (int i = 2; i < *ptr ; i++){
                
                if(*ptr % i ==0){
                    isprime = false;
                    break;
                }
            }
        }
     

    end:
    if (isprime == true){
        cout<<"["<<*ptr << "] It's prime !"<< endl;
    }

    else {
        cout <<"["<<*ptr << "] It's not prime!"<< endl;
    }
 }

    return 0;
}