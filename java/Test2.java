class Test2{
	public static void main(String [] args){
	 


	/*
	*
	**
	***
	****
	***** */
	for(int i = 1; i <= 5; i++){
		for(int j = 1; j <= i; j++){
			System.out.print(" * ");
		}
		System.out.println("");
	}
	 System.out.println("--------");

	/*
	*****
	****
	***
	**
	*
	*/
	for (int i = 1 ; i <= 5 ; i++){
		for (int j = 5; j >= i; j--){
		System.out.print(" * ");
		}
	System.out.println();
	} 
	 /* 
		*
               * *		 
	      * * *
	     * * * *
	    * * * * * 
	 	
  	 */

	/*for(int i = 5; i >= 0; i--){
		for(int j = 0; j <= i; j++){
			
		for(int k = 5; k > 0; k--){
		System.out.print("*");
		 	
		}
		System.out.print(" ");
	}
	System.out.println(" ");
	}*/







	// prime Number
	
	int n = 11;
	int flag = 0;
	for(int i = 0; i <= n; i++){
		if(n % i == 0){
		 flag++;
		}
	 }
	
	if(flag == n ){
	 System.out.println("The number is  prime!");	
	}
	else{
	 System.out.println("The number is not prime! ");
	}



    }
}		

