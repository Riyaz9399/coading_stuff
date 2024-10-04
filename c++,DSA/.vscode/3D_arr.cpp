#include<iostream>
using namespace std;

int main(){

    // int arr[] = {1,0,2,0,3,0,4,0,5,0};


    //  for(int i = 0 ;i < 10; i++){
    //     if (i % 2 != 0){
    //         cout<< arr[i]<<endl;
    //     }   
    //  }
    //  for(int i = 0 ; i < 10 ; i++){
    //     if (i % 2 == 0){
    //         cout<<arr[i]<<endl;
    //     }
    //  } 


    

        string message;
        int space = 0;

        cout << " message :" ;
        getline (cin, message);

        for (int i = 0 ; i  <= message.length();i++){
            if(message[i] == ' '){
                space++;
            }
        }

        cout<< "word : " << space + 1;
    
    return 0;
}