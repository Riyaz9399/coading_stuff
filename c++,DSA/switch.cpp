#include<iostream>
using namespace std;


    int main(){

    int n1,n2,n3,n4,n5;

    int *ptr1 = &n1;
    int *ptr2 = &n2;
    int *ptr3 = &n3;
    int *ptr4 = &n4;
    int *ptr5 = &n5;

    cout << "enter n1 =  ";
    cin >> n1;
    cout << "enter n2 =";
    cin >> n2;
    cout << "enter n3 = ";
    cin >> n3;
    cout << "enter n4 = ";
    cin >> n4;
    cout << "enter n5 = ";
    cin >> n5;

    if(*ptr1 > *ptr2 && *ptr1 > *ptr3 && *ptr1 > *ptr4 && *ptr1 > *ptr5){
        cout<<*ptr1 << "n1 is greater !"<< endl;
        
        if(*ptr2 > *ptr1 && *ptr2 > *ptr3 && *ptr2 > *ptr4 && *ptr2 > *ptr5 ){
            cout<<*ptr2 << "n2 is greater !" << endl;
        }

        else if(*ptr3 > *ptr1 && *ptr3 > *ptr2 && *ptr3 > *ptr4 && *ptr3 > *ptr5){
            cout<< *ptr3 <<" n3 is greater !" << endl;
        }

        else if (*ptr4 >*ptr1 && *ptr4 > *ptr2 && *ptr4 > *ptr3 && *ptr4 > *ptr5){
            cout << *ptr4 << " n4 is greater !"<< endl;
        }
    }

    else {
        cout<< *ptr5 <<"  "<< "n5 is greater" << endl;
    }





    return 0;
    }
