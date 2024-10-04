import java.util.*;
import java.util.Scanner;

class function_Question{
	public static void main(String [] args){

	/*Q7 write a program to enter the number till the user wants and at the end show the count of positive , negative and zeros */

	/* int positive = 0;
	int negative = 0;
	int zeros = 0;
	
	System.out.println("Press 1 to continue and press 0 to end");

 	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();

	while(input == 1){
	 System.out.println("Enter Your number");
	int num = sc.nextInt();
		if(num > 0){
		  positive++;

		} else if(num < 0){
		  negative++;

		} else {
		 zeros++;
		}

	System.out.println("press 1 to continue and 0 to stop");
	 input = sc.nextInt();
	
	}
	
	
	System.out.println("Total number of zeroes you enter : " + zeros);
	System.out.println("Total number of Positive number you enter : " + positive);
	System.out.println("Total number of Negative number you enter : " + negative);
	*/
		

/*Q8 two number are enterd by user and display the raised to the power that is x!n*/
	
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	System.out.println(Power());
	}

	public static int Power(int num1 , int num2){
       int Square = (num1!num2) ;
	return Square ;

	}

}