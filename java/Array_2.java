class Array_2{
	public static void main(String [] args){
		// single_dimenstional array
		
	int [] arr = {10,20,30,40,50};
	
	/*for(int i = 0; i< arr.length; i++){
		System.out.println(arr[i]);
	}*/
	
	for(int a :arr){
		System.out.println(a);	
	}
		
	String [] name = {"sakshi : myself","susheel : father","shreya : singer","sweksha : friend","singer : Dream"};
	
	for(String post : name ){
		System.out.println(post);
	}

		// MultiDimentionals
	
	int num [][] = new int [5][];
	
	for(int i = 0; i < num.length; i++){
		 num[i] = new int[i + 1] ;
		//System.out.println(num[i]);
	}
	for(int i = 0; i < num.length; i++){
	  for(int j = 0; j < num[i].length; j++)	{
		num [i][j] = i * j;
		}
	}
	for(int i = 0; i < num.length; i++){
	  for(int j = 0; j < num[i].length; j++)	{
		System.out.print(num[i][j] + "\t");
		}
		System.out.println("\n");
	}

	System.out.println(num[2][2]);
	
	
   }
}