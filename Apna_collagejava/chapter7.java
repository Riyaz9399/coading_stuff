import java.util.*;
import java.util.Scanner;   
class chapter7{

	public static void print_Myname(String name){
	System.out.println(name);
	return ;
	}
	
	public static int Calculate_Sum(int a, int b){
	 int sum = a + b;
	return sum;	
	}
		
	public static int Calculate_Product(int a, int b){
	 int mul = a * b;
	return mul;	
	}
	
	public static int factorial(int num){
	if(num < 0){
	System.out.println("Invalid Number !");
	}
	int fact = 1;
	for(int i = 1 ; i <= num ;i++){
	 fact = fact * i;
		}
	return fact;
	}

	


	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name ");
	String name = sc.next();
	System.out.println("Enter the value of a = ");
	int a = sc.nextInt();
	System.out.println("Enter the value of b = ");
	int b = sc.nextInt();
	System.out.println("Enter the number to calculate the factorial!");
	int fact = sc.nextInt();

		
	System.out.println("Your name ");
	print_Myname(name);
	System.out.println("Your addation! ");
	int sum = Calculate_Sum(a,b);
	System.out.println(sum);
	System.out.println("The product of a and b = " + Calculate_Product(a,b));
	System.out.println("The factorial of given number = " + factorial(fact));

   }		
}