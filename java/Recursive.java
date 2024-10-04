class Recursive{
	static int count = 0;
	static int n = 10;
	static int fact = 1;
	public static void main(String [] args){
	 p();
	 
	  System.out.println("Your factorial!"+factorial(5));


	for(int i = 1; i < 10; i++){
	 fact = fact * i;
	 System.out.println(i+"="+"The factorial of given number is : "+""+fact);
	}
	System.out.println(fact);
	
   }
	
	static void p(){
	 count++;
	if(count<= 10){
 	System.out.println("Hello! = " + count);
	   p();
	}
	}


	static int factorial(int n){
	   if(n==1){
	     return 1;
	   }
	  else {
	   return (n * factorial(n-1));
	  }
		
	}	

}
