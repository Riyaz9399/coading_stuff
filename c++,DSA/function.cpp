#include<iostream>
using namespace std;

void display();
void sum();

int main(){
    sum();
    display();
}

void sum(){
    int number1 = 10;
    int number2 = 20;
    int sum = number1 +number2;
    cout<<"sum ="<<sum<<endl;
}

void display(){
    int num1 ;
    int num2 ;
    cout<<"enter your mult1 = ";
    cin>> num1;
    cout<<"enter your mult2 = ";
    cin>>num2;

    int multiplication ;
    multiplication = num1 * num2;

    cout<<"multiplication = "<< multiplication ;
    
}