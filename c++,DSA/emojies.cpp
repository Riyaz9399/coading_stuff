#include<iostream>
using namespace std;

int main(){

    char arr[4][5] = {{1,2,3,4,5,},
                     {6,26,27,28,29},
                     {21,22,23,24,25},
                     {16,17,18,19 ,20},
                     };                                                                                  
                                                                                                                       
                                                                                                                       
        for (int rows = 0; rows < 4; rows++){
                for (int coloumn = 0; coloumn < 5; coloumn++){
                
                    cout<<"["<< arr[rows][coloumn]<<"] ="<< "its emojies"<<endl;
                
            }
        }
    return 0;
}