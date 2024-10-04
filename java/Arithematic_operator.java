class Arithematic_operator{
	public static void main(String [] args){
	int a = 17;
	int b = 2;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a/b);
	System.out.println(a*b);	 	
	System.out.println(a%b);

	//unary operator
	System.out.println("unary operator");
	int number = 15;
	int post_increment = number++;
	int pre_increment = ++number;
	int post_decrement = number--;
	int pre_decrement = --number;
	System.out.println(number);
	System.out.println(post_increment);
	System.out.println(pre_increment);
	System.out.println(post_decrement);
	System.out.println(pre_decrement);
	number = -number;
	System.out.println(number);
	 
   }
}