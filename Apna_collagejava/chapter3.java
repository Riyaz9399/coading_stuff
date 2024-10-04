import java.util.*;
import java.util.Scanner;   

class chapter3 {
 	public static void main(String [] args){
	 
	Scanner sn = new Scanner(System.in);
	   
	   
         // The if else of getting vote or not
	//int age = sn.nextInt();
	 /*if(age >= 18){
  		System.out.println("you are an adult! and you can vote!");
		}
	else{
	 System.out.println("you are not and adult! and you can not vote!");
	}
		
	// find the odd or even in the given num
	int num = sn.nextInt();
	if(num % 2 == 0){
	 System.out.println("Even = " + num);
	 }
	else {
	 System.out.println("Odd = " + num);
	}
	*/

 	/* int a = sn.nextInt();
	int b = sn.nextInt();
  	
	if(a == b){
 	 System.out.println("Equal");
	}
 	else if(a > b){
	System.out.println("A is greater!");
	 }
  	else{
	System.out.println("B is greater!");
	} 
	
	

	int button = sn.nextInt();
	if(button == 1){
	System.out.println("Hello");
	}	
	else if(button == 2){
	System.out.println("Nameste!");
	}
	else if(button == 3){
	System.out.println("Bonjour");
	}
	else {
	System.out.println("invalid buttom please tab between 1 to 3");
	}

	switch (button){
	case 1 : 
	  	System.out.println("Hello");
	  	break;
	case 2 : 			     	 		System.out.println("Nameste!");
		break ;
	case 3 :
		System.out.println("Bonjour");
		break ;
	default :
		System.out.println("Please enter number between 1 to 3 ");
		break;
		
	}
	*/
	System.out.println("enter a number a = ");
	int a = sn.nextInt();
	System.out.println("A is =" + a);
	System.out.println("enter a number b =");
	int b = sn.nextInt();
	System.out.println("B is =" + b);
	
	System.out.println("Enter any opetator =");
	char symbol = sn.next().charAt(0);
	System.out.println("Perform operation " + symbol);
	
	
	switch(symbol){
	case '+':
		System.out.println("A + B = " + (a + b));
	break;
	case '-':
	System.out.println("A - B = " +(a - b));
	break;
	case '*':
	System.out.println("A * B = " + (a * b));
	break;
	case '%':
	System.out.println("A % B = " + (a % b));
	break;
	
	case '/':
	System.out.println("A / B = " + (a / b));
	break;
   	default :
	System.out.println("please only give symbol to perform the task nothing else");
	break;
	

}






 	}
}