 import java.util.*;

class chapter2 {
 	public static void main(String [] args){
	System.out.println("Sakhsi kushwaha");
        for(int i = 0 ; i <= 4 ; i++){
	  for(int j = 0; j <= i ; j++ ){
	 	System.out.print("*");
		}
		System.out.println();
	 }
		
	  // input from the user 
		
	  Scanner sn = new Scanner(System.in);
	   int a = sn.nextInt();
	   int b = sn.nextInt();
	   int sum = a + b;
	System.out.println("sum = " + sum);
	
	}
}