class if_Conditionals{
	public static void main(String []args){
	 // conditonal statements
	/*int marks = 95;
	if(marks < 40){
		System.out.println("More hardwork is required");
		marks = marks + 5;
	}


	System.out.println(" your marks are: " + marks);*/
	


	// if else statements
	/*int marks = 38;
	if (marks < 40){
		System.out.println("Sorry you fail in this attempt work hard and come soon again !");
	}
	else{
		System.out.println("Congratulation!..you clear the exam ");
	}*/

	/*int num = 58;
	if(num % 2 == 0){
		System.out.println("Even Number : "+ num);
	}

	else {
		System.out.println("Odd number: " + num);
	}

	System.out.println("Thanks! to using my odd even java program");*/
	

	//ifElseIf_ladderDomo.. statements

	int temperature = -30;
	if(temperature <= 0){
		System.out.println("its a solid ice ..!");	
	}
	else if (temperature >= 100){
		System.out.println("its Vapour !");
	}
	else {
		System.out.println("Its water!");
	}
	
	System.out.println("Thanks ! for using my Temperature Program ");
	
	
	int marks = 65;
	 
	if(marks < 40 ){
	   System.out.println("you Failed!");
	}
	
	else if (marks < 50){
		System.out.println(" You scored Third  class!");
	}

	else if (marks < 60){
	 System.out.println("You scored second class!");
	 }
	
	 else if(marks < 70){
		System.out.println("You scored  first class!");
	}
	
	else {
	 System.out.println("You Scored Distinction! ");
	}
	
  }
}