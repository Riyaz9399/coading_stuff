import java.util.*;

class chapter13 {
	public static void main(String []args){
	// string Builder

	/*StringBuilder sb = new StringBuilder("Tony");
	System.out.println(sb);
	
	//char at index 0;
	System.out.println(sb.charAt(0));


	// set char at index 0
	sb.setCharAt(0,'p');
	System.out.println(sb);

	// insert char at string

	sb.insert(2,'n');
	System.out.println(sb);
		
	// Delete the extra n;
	sb.delete(2,4);
	System.out.println(sb);

	// Append the char in sb
	sb.append("Y");
	System.out.println(sb);

	// length of sb
	System.out.println(sb.length());*/	

	
/*THE program to reverse the string*/
	StringBuilder sb = new StringBuilder("Hello");
	for(int i = 0; i < sb.length()/2 ; i++){
	int front = i;
	int back = sb.length() - 1 - i;// 5-1-i;
	
	char frontChar = sb.charAt(front);
	char backChar = sb.charAt(back);

	System.out.print(front);
	System.out.println(frontChar);
	System.out.print(back);
	System.out.println(backChar);
		

	sb.setCharAt(front,backChar);
	sb.setCharAt(back,frontChar);

	}

	System.out.println(sb);



	



	}
}