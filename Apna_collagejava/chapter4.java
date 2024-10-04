import java.util.*;
import java.util.Scanner;   

class chapter4{
 	public static void main(String [] args){

	/*System.out.println("For loop");
	for(int i = 0 ; i <= 100; i++){
 	System.out.println("Hello world! " + i);
	}
	System.out.println("While loop");
	int n = 1;
	while (n <= 12){
	System.out.println("Hello world! " + n);
	n++;
	}
	System.out.println(" do While loop");
	int num = 1;
	do{
	System.out.println("Hello world! " + num);
 	num++;
	}while(num <= 10);*/

	/*System.out.println("Print n number of natural number!");

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Number of given iterations ="+ n);
	int sum = 0;
	for(int i = 0 ; i <= n ; i++){
	sum += i;
	}
	System.out.println("sum of the diven iterations = "+ sum);*/

	Scanner sc = new Scanner(System.in);
	int table = sc.nextInt();
	System.out.println("Number given bur the user : "+ table);
	
	for(int j = 0 ; j <= table ; j++ ){
	for(int i = 1 ; i <= 10; i++){
	 System.out.println(table + " * " + i + " " + "=" + (table * i));
	}
	
}
	




	}
 
}