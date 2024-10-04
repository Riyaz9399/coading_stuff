class Conditional_Operator{
	public static void main(String [] args){
	
	int a = 7 , b = 22 ,c = 12 , max;
	max = (a>b) ? (a > c) ? a :c: (b>c) ? b:c;
	System.out.println("maximum value of numbers : "+max);
  }
}