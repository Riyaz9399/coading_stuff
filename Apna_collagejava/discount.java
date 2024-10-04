
 class discount{
public static void main(String[] args) {
	int discount = 10; // discount is a variable
	double totalPrice = 200; // totalPrice is a variable
	double priceAfterDiscount = totalPrice * (1 - ((double) discount / 100)); // priceAfterDiscount is a variable
	System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
}
}