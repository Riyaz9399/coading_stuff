import java.util.*;
import java.util.Scanner;
class chapter7_Questions{

	// print the Average of given number
	public static int Average(int a, int b,int c){
	int sum = a + b + c;
	int average = sum/3;
	return average;
	}

	// print the sum of all Odd numbers
	public static int Sum(int num){
	 int sum = 0;
	  for(int i = 0 ; i <= num ; i++){
		if(i % 2 != 0){
	 	sum = sum + i;
			}
		}
	return sum;
	}

	// find the greater number
	public static void Greater(int num1 , int num2){
	 if(num1 > num2){
		System.out.println("Num1 is greater than Num2 = " + num1);
		}
	else if(num1 == num2){
		System.out.println("Num1 is equal to Num2 = "+ num1 + " " + num2);
		}
	else{
		System.out.println("Num2 is greater than Num1 = " + num2);
		}
	}


	// Calculate the circumference of the circle
	
	public static float Circle(int radius){
	float pie = 3.14f; 
	 float Circumference = 2 * pie * radius;
	 return  Circumference;
	
	}
	
	// Calculate the person is eligible to vote or not
	
	public static void Vote(int age){
	 if(age >= 18){
		System.out.println("you can vote!");
		}
	 else{
		System.out.println("You can not vote!");
		}
	 
	}




	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	/*System.out.println("Enter the value of A=");
	int a = sc.nextInt();
	System.out.println("Enter the value of B=");
	int b = sc.nextInt();
	System.out.println("Enter the value of C=");
	int c = sc.nextInt();
	
	System.out.println("The average number of a , b,c is = "+ Average(a,b,c));
	
	System.out.println("Enter the number to calculate the sum of odd numbers");
	int num = sc.nextInt();
	System.out.println("The sum of all odd N number's are = "+Sum(num));
	
	System.out.println("Enter two values to find the greater one");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println("Check who is greater Num1 or Num2 ");
	Greater(num1 , num2);
	
	System.out.println("Enter the value of radius ");
	int radius = sc.nextInt();
	System.out.println("Calculate the Circumference of the circle = " + Circle(radius));

	
	System.out.println("Enter the age ");
	int age = sc.nextInt();
	System.out.println("Your age = " + age);
	Vote(age);
	*/

	System.out.println("")
	
	}
	
	
	




}