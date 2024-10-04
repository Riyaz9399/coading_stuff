import java.util.*;
import java.util.Scanner;   

class chapter5{
	public static void main(String [] args){

	System.out.println("Take the input from the user !");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the row number= "); 
	int n = sc.nextInt();
	System.out.println("Enter the column number= "); 
	int m = sc.nextInt();

	
	System.out.println("Solid Rectangle");
	for(int i = 0; i <= n ; i++){
	 for(int j = 0; j <= m; j++){
	System.out.print("*");
		}
	System.out.println();
	}
	
	

	System.out.println("The hollow rectangle");
	for(int i = 0; i <= n ; i++){
	   for(int j = 0 ; j <= m;j++ ){
		if(i == 0 || i == n || j == 0 || j == m){
			System.out.print("*");

				}
		else{
		System.out.print(" ");
		}
			}
		System.out.println();
		}
	
	System.out.println("The premid");
	for(int i = 0; i <= m; i++ ){
	 for(int j = 0 ; j < i ; j++){
	 	System.out.print("*");
		}
		System.out.println();
	}

	
	System.out.println("The inverted half premid");
	for(int i = n; i >= 1; i-- ){
	 for(int j = 0 ; j < i ; j++){
	 	System.out.print("*");
		}
		System.out.println();
	}


	System.out.println("The inverted with spaces half premid");
	
	  for(int i = 0 ; i <=n ; i++){	
		for(int j = 0 ; j <= n-i; j++){	
		 System.out.print(" ");
		}
		for(int j = 0; j <= i ; j++){
		System.out.print("*");
			}
		System.out.println();
	
	}


	
	System.out.println("The half premid of numbers!");
	
	for(int i = 1 ; i <= n; i++){
	  for(int j = 1 ; j <= i ; j++){
		System.out.print(j + " ");	
		}
		System.out.println();
	}

	System.out.println("The inverted half premid of numbers!");
	
	for(int i = 1 ; i <= n ; i++){
	  for(int j = 1 ; j <= n-i ; j++){
		System.out.print(j + " ");	
		}
		System.out.println();
	}

	System.out.println("The floud's triangle of numbers!");
	int count = 1;
	for(int i = 1 ; i <= n ; i++){
	  for(int j = 1 ; j <= i ; j++){
		System.out.print(count + " ");
		count++;	
		}
		System.out.println();
	}
	
	System.out.println("The inverted floud's triangle of numbers!");
	int count1 = 1;
	for(int i = 1 ; i <= n ; i++){
	  for(int j = 1 ; j <= n-i ; j++){
		System.out.print(count1 + " ");
		count1++;	
		}
		System.out.println();
	}

	System.out.println("The premid of zero's and one's with the helps of loop!");

	
	for(int i = 1 ; i <= n ; i++){
           for(int j = 1 ; j <= i ; j++){
		int sum = i +  j;
		if(sum % 2 == 0){
		System.out.print("1 ");
		}
		else{
		System.out.print("0 ");
		}
	  }
		System.out.println();
	}











	}




}