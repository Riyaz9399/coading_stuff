class Loops {
	public static void main(String [] args){
	
		// while loop

		
	/*int number = 100;
	int i = 1;
	int sum = 0;
	
	while(i <= number){
	 System.out.println("Sum of 1 to 10 : " + (sum += i));
	 i++;
	}
	 System.out.println(sum);*/

	// do while loop

	/*int num = 10;
	int i = 1, sum = 0;
	
	do {
	 System.out.println(sum += i);
	 i++;
	}while(i <= num); 
	
	System.out.println("The summation of 1 to 10 is :"+sum);
	*/


	// for loop
	
	/*int num = 1000;
	for(int i = num; i >= 1 ; i--){
		
		System.out.println(i);
	}*/

	
	// for_Each loop
	int [] mylist = {1,2,3,4,5,6,7,8,9,10};
	int sum = 0;
	
	for(int val : mylist){
		sum += val;
		System.out.println(val);
	}
		System.out.println("Summation of all the elements of array : "+sum);
    }
}


