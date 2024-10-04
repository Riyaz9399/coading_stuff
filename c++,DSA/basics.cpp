// #include <iostream>
// using namespace std;

// int main()
// {


//   for (int n = 2; n <= 5; n++)  { // Outer For Loop

//              cout << "Table Of [" << n << "] \n"<< endl;

//                                for (int i = 1; i <= 10; i++)   { // Inner loop


//                                         if(((i * n) % 2) == 0)  {

//                                               cout << n   <<"  *  " << i << "  of  "<< n  * i << "  (It's Even)" << endl;
//                                         }

//                                         else {

//                                               cout << n << "  *  " << i <<"  of  " << n * i << "  (It's Odd)" << endl;
                                            
//                                         }

//                                 }

//                  cout << "\n "<< endl;
//   }


//        return 0;

// }

#include<iostream>
using namespace std;
 
 int main(){
      int num1;
      cout<<" enter num1"<<endl;
      cin>>num1;

      int num2;
      cout<<"enter num2"<<endl;
      cin>>num2;

      char ch ;
      cout<<"INPUT" <<endl;
      cin>>ch;

      switch (ch)
      {
      case '+':
       cout<<"sum = "<< "["<< num1 + num2<<"]"<<endl;
            break;
      case '-':
       cout<< " sub = "<< "["<< num1 - num2 <<"]"<<endl;
            break;
      case '*':
      cout<<"multiplication = "<<"["<< num1 * num2 <<"]"<<endl;
            break;
      case '/':
      cout<<"division = "<<"["<<num1 / num2 <<"]"<< endl;
            break;
      default:
      cout<<"wrong choice !"<<endl;
            break;
      }

 }
