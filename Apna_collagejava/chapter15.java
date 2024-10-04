import java.util.*;

class chapter15{
	public static void main(String [] args){
	
	/*int n = 5;
	int pos = 2;
	int bitmask = 1 << pos;*/
	
	// get bit 
	/*if((bitmask | n ) == 0){
	   System.out.println("The bit is zero");
	}
	else {
	  System.out.println("The bit is one");
	}*/

	// set bit
	/*int newNumber = bitmask | n;
	System.out.println(newNumber);*/

	// clear bit

	/*int notBitmask = ~(bitmask);
	int ClearBit = notBitmask & n;
	System.out.println(ClearBit);*/
	
	// update bit
	Scanner sc = new Scanner(System.in);
	int oper = sc.nextInt();
	// oper=1 : set oper=0; clear
	int n = 5;
	int pos = 1;
	int bitmask = 1 << pos;
	
	if(oper == 1){
		int newNumber = bitmask | n;
		System.out.println(newNumber);
	}
	else{
		int Notbitmask = ~(bitmask);
		int newNumber = Notbitmask & n;
		System.out.println(newNumber);
	}



	
	}

}