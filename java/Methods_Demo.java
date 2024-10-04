class Methods_Demo{

	/*public static boolean is_Prime(int n){
	boolean flag = true;
	for(int i = 2 ; i < (int)n/2 ; i++ ){
	   if (n % i == 0){
	     flag = false;
		break;
            }
	}
	  return flag;
   }*/
	public static void f(){
	 System.out.println("Inside F... before Calling g()");
         g();
	System.out.println("Inside F.. after calling g()");
	}
         public static void g(){
	 System.out.println("Inside g... before Calling h()");
         h();
	System.out.println("Inside g.. after calling h()");
	}

public static void h(){
	 System.out.println("Inside H" );
	}


	



	public static void main(String [] args){

	// methods with Prime number Example 
	
	/*int num = 121;
	if(is_Prime(num)){
	System.out.println("The number is prime !" + num);
       }
	else{
	System.out.println("The number is not prime !" + num);
	}*/
	
	// function_ demo F G H
	System.out.println("Before calling Function!");
	f();
	System.out.println("Inside main callin F function!");





  }

}