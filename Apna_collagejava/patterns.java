class patterns {
 public static void main(String [] args ){
  // Solid rectangle 
	System.out.println("Soild Rectangle");
        System.out.println("");
 for(int i = 0 ; i <= 3 ; i++){
   for(int j = 0 ; j <= 4; j++){
     System.out.print("*");
   }
  System.out.println(" ");
 }  
  	// hollow rectangle
  	System.out.println("");
 
 	System.out.println("Hollow Rectangle");
        System.out.println("");

 for(int i = 0 ; i <= 3 ; i++){
   for(int j = 0 ; j <= 4; j++){
     if(i == 0 || j == 0 || i == 3 || j == 4){
	System.out.print("*");
      }
	 else{
	 System.out.print(" ");
	}
     
   }
  System.out.println(" ");
 }   

   // triangle shaped
	System.out.println("");
	System.out.println("premid of stars");
        System.out.println("");
	
   for(int i = 0 ; i <= 5 ; i++){
	for(int j = 0 ; j <= i ; j++){
	 System.out.print("*");
	}	
	System.out.println(" ");
   }
	System.out.println(" ");
	System.out.println("invert premid of stars");
        System.out.println(" ");
/* ******
   *****
   ****
   ***
   **
   *
*/
	
   for(int i = 5 ; i >= 0 ; i--){
	for(int j = 0 ; j <= i ; j++){
	 System.out.print("*");
	}	
	System.out.println("");
   }
 }
}


