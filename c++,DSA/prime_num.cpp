#include <iostream>
#include<cmath>
using namespace std;

/*  Prime 

Prime    n % 1 == 0
Prime    n % n == 0
 



int main()
{

        int n;
        bool isPrime = true;

        cout << "Enter a value: ";
        cin >> n;
        
        for (int  a= 0; a<= 100;  a++){

        if(n == 2) {  // Smallest Prime number is (2)
             
                goto end;
        }

        else {  // If False 

               for(int i = 2; i < n; i++) {

                       if(n % i == 0) {   
                            
                              isPrime = false; 
                              break; 
                       }
               }
        }

        end:

        if(isPrime == true) {
             
                cout << n << "It's a Prime!";
        }

        else {

             cout << n << "It's Not a Prime!";
        }
        }*/

        int main(){
        int n ;
        cin >> n;

        bool isprime = true; 

        
        for (int i = 0 ; i <= n; i++ ){
        for ( int i = 2 ; i <= n ; i++){
                if (n % i == 0){
                 isprime = false;
                break;
                }
        }
        }

        if (isprime ==  true ){
                cout<<"prime"<< endl;
        }
        else {
                cout << "its not prime "<<endl;
        }

       return 0;

}