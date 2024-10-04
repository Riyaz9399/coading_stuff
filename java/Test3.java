class Test3{
	public static void main(String [] args){
	
	/* find the even and odd number in this array and count the number of even and odd number exists in this array */

	 int [] arr = {10,25,33,42,55,60};

	int Even_count = 0, Odd_count = 0;
	
	for (int i = 0 ; i < arr.length ;i++){
	 if(arr[i] % 2 == 0){
	System.out.println("Even : "+arr[i]);
	  Even_count++;
	}
	 else{
	 System.out.println("Odd :"+ arr[i]);
	  Odd_count++;
	}  
	}
	
	System.out.println("Total number of Even present in this array : " + Even_count);
	System.out.println("Total number of Odd present in this array : " + Odd_count);
	
		
	/* create the 2D array and find the minimum number from the array and store it in another array */ 
	
	//int 2Darray [][] = new int[5][6];
	
	
	/*2Darray[0][0] = 1;
	2Darray[0][1] = 2;
	2Darray[0][2] = 3;	
	2Darray[0][3] = 4;
	2Darray[0][4] = 5;
	2Darray[0][5] = 6;  
	2Darray[1][0] = 7;
	2Darray[1][1] = 8;
	2Darray[1][2] = 9;
	2Darray[1][3] = 10;
	2Darray[1][4] = 11;
	2Darray[1][5] = 22;
	2Darray[1][0] = 33;
	2Darray[1][1] = 44;
	2Darray[1][2] = 55;
	2Darray[1][3] = 66;
	2Darray[1][4] = 77;	
	2Darray[1][5] = 88;
	2Darray[2][0] = 99;
	2Darray[2][1] = 101;
	2Darray[2][2] = 11;
 	2Darray[2][3] = 12;
	2Darray[2][4] = 13;
	2Darray[2][5] = 14;
	2Darray[3][0] = 15;
	2Darray[3][1] = 16;
 	2Darray[3][2] = 17;
	2Darray[3][3] = 18;
	2Darray[3][4] = 19;
	2Darray[3][5] = 20;
	2Darray[4][0] = 21;
 	2Darray[4][1] = 22;
	2Darray[4][2] = 23;
	2Darray[4][3] = 24;
	2Darray[4][4] = 25;
	2Darray[4][5] = 26;*/

  /*for(int i = 0; i < 2Darray.length; i++){
	  for(int j = 0; j < 2Darray[i].length; j++)	{
		System.out.print(num[i][j] + "\t");
		}
		System.out.println("\n");
	}*/
	













   }

}