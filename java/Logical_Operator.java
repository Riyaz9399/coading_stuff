class Logical_Operator{
	public static void main(String []args){
	int a = 5, b = 7 , c = 3;

	// And Operator

	System.out.println("A is smallest : "+((a<b) && (a<c)));
	System.out.println("B is smallest : "+((b<a) && (b<c)));
	System.out.println("C is smallest : "+((c<a) && (c<b))); 

	// Or Operator

	System.out.println("A is not largest: " + ((a<b) || (a<c)));
	System.out.println("B is not largest : "+((b<a)||(b<a)));
	System.out.println("C is not largest : "+((c<b)||(c<a)));
 }
}