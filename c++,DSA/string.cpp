#include<iostream>
using namespace std;

int main()
{
    string student[4][2]={{"ram","ramesh"} ,{"sakshi","vinu"},{"harsh", "krish"},{ "priyansh" , "tony"}};

    for (int rows = 0; rows < 4 ; rows++){

        for (int coloumn = 0; coloumn < 2; coloumn++){
            cout << student[rows][coloumn]  << endl;
        }
        cout<<endl;
    }
}