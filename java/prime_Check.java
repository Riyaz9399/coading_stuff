class prime_Check{
	public static void main(String [] args){
	
	int num = 19;
	boolean flag = true;
	for(int i = 2 ; i < (int)num/2 ; i++ ){
	   if (num % i == 0){
	     flag = false;
		break;
            }
	}

	if(flag == true){
	System.out.println("The number is prime !" + num);
       }
	else{
	System.out.println("The number is not prime !" + num);
	}

	int num2 = 456;
	flag = true;
	for(int i = 2 ; i < (int)num2/2 ; i++ ){
	   if (num % i == 0){
	     flag = false;
		break;
            }
	}

	if(flag == true){
	System.out.println("The number is prime !" + num2);
       }
	else{
	System.out.println("The number is not prime !" + num2);
	}
	
}
}