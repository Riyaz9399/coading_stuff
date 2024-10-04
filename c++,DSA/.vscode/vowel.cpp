#include<iostream>
using namespace std;

int main(){

     

    char arr[9][6]= {{'a','b','c','d','e','f'},
                    {'g','h','i','j','k','l',},
                     {'m','n','o','p','q','r'},
                     {'s','t','u','v','w','x'},
                     {'z','A','B','C','D','E'},
                     {'F','G','H','I','J','K'},
                     {'L','M','N','O','P','Q'},
                     {'R','S','T','U','V','W'},
                     {'X','Y','Z','#','&','|'}};

    for ( int rows = 0; rows < 9; rows++){
        for(int coloumn = 0 ; coloumn < 6; coloumn++){
            if ( 
                arr[rows][coloumn]=='A'|| arr[rows][coloumn]=='E'|| arr[rows][coloumn]=='I'|| arr[rows][coloumn]=='O'|| arr[rows][coloumn]== 'U'||
                  arr[rows][coloumn]=='a'|| arr[rows][coloumn]=='e'|| arr[rows][coloumn]=='i'|| arr[rows][coloumn]=='o'|| arr[rows][coloumn]== 'u'
            ){
                cout <<"["<<arr[rows][coloumn]<<"]"<< "  its vowel"<<endl;
            }
                else {
                    cout <<"["<<arr[rows][coloumn]<<"]"<<"  its consonent"<< endl;
                }
            
    
        }
    }

    return 0;
}