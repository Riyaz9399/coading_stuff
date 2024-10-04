import java.util.*;
import java.util.Scanner;   
 class chapter6{

	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of row's = ");
	int rows = sc.nextInt();
	System.out.println("Enter the number of coloumn's = ");
	int col = sc.nextInt();
	System.out.println("The butterfly pattens");
	for(int i = 0; i <= rows; i++){
	   for(int j = 0 ; j <= i ; j++){
	   System.out.print("*");
		}
	int spaces = 2*(rows-i);
	for(int j = 0 ; j < spaces ; j++){
		System.out.print(" ");
		}
	  for(int j = 0 ; j <= i ; j++){
	 	System.out.print("*");
		}
	   System.out.println();
	}
	
	for(int i = rows; i >= 1; i--){
	   for(int j = 0 ; j <= i ; j++){
	   System.out.print("*");
		}
	int spaces = 2*(rows-i);
	for(int j = 0 ; j < spaces ; j++){
		System.out.print(" ");
		}
	  for(int j = 0 ; j <= i ; j++){
	 	System.out.print("*");
		}
	   System.out.println();
	}


	System.out.println("Solid rombus");
	
	for(int i = 0; i <= rows; i++){
	  for(int j = 0 ; j <= rows-i ; j++){
		System.out.print(" ");		}
		
	for(int j = 0 ; j <= rows ; j++){
		System.out.print("*");
	 }
	   System.out.println();
	}

	System.out.println("Solid hollo rombus");
	
	for(int i = 0; i <= rows; i++){
	  for(int j = 0 ; j <= rows-i ; j++){
		System.out.print(" ");		}
	  for(int j = 0 ; j <= 5; j++){
		
		if(j == 0 || j == 5 || i == 0 || i == rows){
			System.out.print("*");
		}
		else{
			System.out.print(" ");	
		}
		

		}
		
	   System.out.println();
	}


	System.out.println("The full pramid of number! ");
	
	for(int i = 1 ; i <= rows ; i++){
	for(int j = 1 ; j <= rows-i ; j++){
		System.out.print(" ");
	}
	
	 for(int j = 1 ; j <= i ; j++){
		System.out.print(i + " ");
		}
		System.out.println();
	}
	
	System.out.println("The palindromic patterns!");
	
	for(int i = 1 ; i <= rows ; i++){
	  for(int j = 1 ;j <= rows-i; j++){
		System.out.print(" ");
		}
		
	for(int j = i ; j >= 1 ; j--){
		System.out.print(j);
		}
	for(int j = 1 ; j <= i ; j++){
		System.out.print(j);
		}
			
	System.out.println();	
	
	}	
	System.out.println();
	System.out.println("The diamond Patterns");

	for(int i = 1 ; i <= rows ; i++){
	  for(int j = 1 ; j <= rows-i ; j++){
	 	System.out.print(" ");
		}
	
	  for(int j = 1 ; j <= 2*i-1; j++){
		System.out.print("*");
		}
	System.out.println();

	}
	for(int i = rows ; i >= 1 ; i--){
	  for(int j = 1 ; j <= rows-i ; j++){
	 	System.out.print(" ");
		}
	
	  for(int j = 1 ; j <= 2*i-1; j++){
		System.out.print("*");
		}
	System.out.println();

	}



	
	}

		
}