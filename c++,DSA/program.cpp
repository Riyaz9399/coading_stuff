#include <iostream>
using namespace std;
 int main(){
    int n = 1;

    for( n ; n<=10;n++){
        
        int fact = 1;
        int i = n;
        
        for (int i=1; i<=n; i++){

            fact = fact * i;
        }
        cout<<"\n factorial of -->["<< n <<"]"<<"-->"<<"["<< fact <<"]"<<endl;

    }
    return 0;
 }

