class patterns_2{
     public static void main(String [] args){
/*
   *
  **
 ***
****
*/
		System.out.println("The premid of stars");
	int n = 5;
	 for(int i = 0 ; i <= n; i++){
	    for(int j = 0 ; j <= n-i ; j++ ){  
 	 	 System.out.print(" ");
		}
	    for(int j = 0; j <= i ; j++){
	     System.out.print("*");
		}
	 System.out.println(" ");
	}

/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
	System.out.println("The premid of numbers the formula of inner loop is j <= i");
	for(int i = 1; i <= 5 ; i++){
	 for(int j = 1 ; j <= i ; j++){
 		System.out.print(j+" ");
		}
	 System.out.println();
	}
/*
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2 
 1  
 */
System.out.println("The inverse premid of numbers with the opposite of outer loop");
	for(int i = 5; i >= 0 ;i--){
		for(int j = 1 ; j <= i ; j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("The inverted number peramid with the inner formula loop which is j = n-i or j = n-i+1...");
	for(int i = 0; i <= n ;i++){
		for(int j = 1 ; j <= n-i ; j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}

	System.out.println("flodies Triangle");
	/*
	 1
	 2 3
	 4 5 6
	 7 8 9 10
	 11 12 13 14 15
	 */
	int number = 1;
		for(int i = 0 ; i <= n ;i++){
			for(int j = 0 ; j <= i;j++){
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

      /*\
	   1
	   0 1
	   1 0 1
	   0 1 0 1
	   1 0 1 0 1
	   */
	}
}






