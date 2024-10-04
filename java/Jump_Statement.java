class Jump_Statement{

	public static int sum(int a, int b){
		if(a>b)
		return a;
		else 
		return b;
	}
	
	public static void main(String [] args){
	
	// break and continue...

	/*int number = 100;
	for (int i = 1; i <= number ; i++){
	if((i == 77)||(i == 34)||(i == 56))
			continue;
	System.out.println("Just came out of loop! : "+ i);
	}*/

	//labelled break and continue
	/*out:
	for (int i = 1; i <=100; i++){
	 System.out.println("From Outer : "+i);
		for(int j = 1; j <= 5; j++){
		
		if(j == 3){
		  continue out;
		}
	 System.out.println("From inner loop :" + j);
		}
		
	}*/

	// return_domo

	int a = 7, b = 6;
	int ans = sum(a,b);
	System.out.println("Return the sum of A and B :" + ans);
	
	

	
	

	
		
  }
}