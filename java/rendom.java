

class rendom1 {
	public static void main(String [] args){
int n = 11;
	int flag = 0;
	for(int i = 0; i <= n; i++){
		if(n % i == 0){
		 flag++;
		}
	 }
	
	if(flag == n ){
	 System.out.println("The number is  prime!");	
	}
	else{
	 System.out.println("The number is not prime! ");
	}

   }
}