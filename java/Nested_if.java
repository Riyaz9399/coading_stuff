class Nested_if{
	public static void main(String [] args){
	
	/*int marks = 95 ;
	
	if (marks < 40){
		System.out.println("you could not clear the Test");	
	}
        else{
	 System.out.println("You cleared the Test");
	  if(marks >= 70){
		System.out.println("you cleared the test with Distinction");
	  }
	  else if(marks >= 60){
		System.out.println("You cleared the test with first class");
		}
	   else if(marks >= 50){
		System.out.println("You cleared the test with second class");
		}
	   else {
		System.out.println("you cleared the test with average marks!");
		}		

        }*/
		int marks = 50;
	if (marks >= 40){
	 System.out.println("You cleared the Test!"); 
	
	    if(marks < 50){
		System.out.println("With third class!");
		}
	    else if (marks < 60 ){
		System.out.println("With second class!");
		}
	    else if (marks < 70){
		System.out.println("With third class!");
		}
	    else { 
		System.out.println("With Distinction!");
		 }
	 }

	else {
	   System.out.println("Sorry you are fail please do work hard and try again!");
	} 
	


	

   }
}