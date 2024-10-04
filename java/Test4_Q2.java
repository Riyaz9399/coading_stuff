class Test4_Q2{

 	static int Add(int a ,int b, int c){
	  return a + b + c;
	}

	static int Add(int a , int b){
	  return a +b;
	}
	
	static float Add(float a , float b){
	  return a + b;
	}


	public static void main(String [] args){

	/* write a program to call a methods according to the parameters differences take a help of method overloading tecnique */


	
	
	System.out.println("Sum of the Three digit A , B , C = " + Add( 10 , 29 , 45));

	System.out.println("Sum of the Two digit A , B : " + Add(102, 2324));

	System.out.println("Sum of the Two Float Digits : "+ Add(458.2f, 234f));
	
	}	
	
   }