class Test4{
	public static void main(String [] args){
	
	/* write a program to print a reverce of the given number */
	
	int num = 1357;
	int reverce = 0;
	
	System.out.println(num);
	
	while(num >= 1){
	int remainder = num % 10;
	//System.out.println(remainder);
	reverce = (reverce * 10 )+ remainder;
	//System.out.println(reverce);	
	 num = num / 10;
	//System.out.println(num);
	}
	
	System.out.println(reverce);

     }


	 

	
}
