import java.util.*;


class chapter10{
	public static void main(String args[]){

	/*int[] marks = new int[3];
	int marks[] = {12,453,546};
	marks[0] = 78;
	marks[1] = 69;
	marks[2] = 78;
	//System.out.println(marks[0]);
	//System.out.println(marks[1]);
	//System.out.println(marks[2]);
	for (int i = 0 ; i < marks.length ; i++){
		System.out.println(marks[i]);
	
		}
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int number[] = new int[size];
	
	// input loop
	for(int i = 0 ; i < number.length ; i++)	{
	 number[i] = sc.nextInt();
	}

	output loop
	for(int i = 0 ; i < number.length ; i++)	{
		System.out.println(number[i]);
	}
	
	 find the x number in the array
	System.out.println("Enter the length of the array");
	int num = sc.nextInt();
	int find[] = new int[num];
	
	for(int i = 0; i < find.length ; i++){
		find[i] = sc.nextInt();
	}
	System.out.println("Enter the number you want to find");
	int x = sc.nextInt();
	for(int i = 0 ; i < find.length ; i++){
		if(find[i] == x){
		System.out.println("THE x is find in "+i + " position");
		}
	}*/


	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int number[] = new int[size];
	
	// input
	for(int i = 0 ; i < size ; i++){
	 number[i] = sc.nextInt();
	}
	 int max = Integer.MAX_VALUE;
	int min = Integer.MIN_VALUE;

	// outer loop

	for(int i = 0 ; i < number.length ; i++){
	
	if(number[i] > min){
	min = number[i];
	
	}
	if(number[i] < max){
	max = number[i];
	}
}
	System.out.println(max);
	System.out.println(min);


	}
}