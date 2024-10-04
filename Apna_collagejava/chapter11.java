import java.util.*;

class chapter11{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int rows = sc.nextInt();
System.out.println("Enter the number of cols");
	int col = sc.nextInt();
System.out.println("Enter the values of rows and column");
	int [][]numbers = new int[rows][col];
	
	// input loop
	for(int i = 0 ; i < rows ; i++){
		for(int j = 0 ; j < col; j++){
		numbers[i][j] = sc.nextInt();
		}
	System.out.println();
	}	
	System.out.println("ENter the number you what to search");
	int x = sc.nextInt();
	System.out.println("The outPut");
	//output
	for(int i = 0 ; i < rows ; i++){
		for(int j = 0 ; j < col; j++){
		if(x == numbers[i][j]){
		System.out.println("The x fount at location " + i + " and "+ j );
		}
		//System.out.print(numbers[i][j]);
		}
	System.out.println();
	}	


	/*Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of rows : ");
	int rows = sc.nextInt();
	System.out.println("Enter the number of col : ");
	int col = sc.nextInt();
	
	int numbers[][] = new int[rows][col];
	
	for(int i = 0 ; i < rows ; i++){
	  for(int j = 0 ; j < col; j++){
		
		for(int k = 0 ; k < 20 ; k++){
		if(k % 2 != 0){
		numbers[i][j] = k; 
		}
	}
		System.out.println(numbers[i][j]);
		}
	
	
	}*/





	}
}