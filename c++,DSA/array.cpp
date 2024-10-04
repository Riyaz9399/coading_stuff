#include<iostream>
using namespace std;
int main(){


  /*  int arr[4][3] = {{11,-23, 33} ,
                    {-41 , 51 , 0} , 
                    {71 , 0, -97 },
                    {0, 110, 129}};


    for (int rows = 0; rows < 4; rows++){
    
        for(int coloumn = 0;coloumn < 3 ; coloumn++){
           if(arr[rows][coloumn] > 0)
          {
            cout<< arr[rows][coloumn] <<"  = " << "its positive"<< endl;
          }

          else if (arr[rows][coloumn] < 0){
            cout<< arr[rows][coloumn] <<"  ="<<  "its negative" <<endl;
           }

          else{
            cout << arr[rows][coloumn]<<"  = " << "its zero" << endl;
          }
        }
       // cout <<endl;

    }

    int arr[4][3]={{3,34,34},{66,76,87},{23,65,34},{73,69,07}};

        for(int rows = 0 ;rows < 4; rows++){
            for(int coloumn = 0 ; coloumn < 3; coloumn++){
                if (arr[rows][coloumn] % 2 == 0){
                    cout <<arr[rows][coloumn] <<"  "<< "EVEN !"<< endl;
                }
                else {
                    cout <<arr[rows][coloumn] <<"  "<< "odd !" << endl;
                }
            }
            cout<< endl;
        }


        int arr[] ={10,12,43,56,67,24,67};
        cout << arr[0]<<endl;
        cout << arr[1]<<endl;
        cout << arr[2]<<endl;
        cout << arr[3]<<endl;
        cout << arr[4]<<endl;
        cout << arr[5]<<endl;
        cout << arr[6]<<endl;
        */

       int arr[] = { 10,20 ,30 ,40,50};

        int *ptr = arr;
       int temp = 0;

       for (int i = 0; i < 5; i++){

        temp = temp + ptr[i];
       }

       cout<<"sum of Array = "<< temp << endl;

    return 0;
}