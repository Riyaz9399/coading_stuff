class Shorting{

	public static void printArray(int arr[]){
	 for(int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}



	public static void main(String[] args){

	
	int arr[] = {7,8,3,1,2,12,9,21};

	// time complexity = O(n^2);
	//Bubble short
	/*for(int i = 0 ; i < arr.length-1; i++){
	for(int j = 0 ; j < arr.length-i-1;j++){
		if(arr[j] > arr[j+1]){
		 // swap
		  int temp = arr[j];
		  arr[j] = arr[j+1];
		  arr[j+1] = temp;
		}

		}
	
	}

	printArray(arr);*/


	// selection sort

	/*for(int i = 0 ; i < arr.length-1; i++){
		int smallest = i;
	for(int j = i+1 ; j < arr.length ; i++){
		if(arr[smallest] > arr[j]){
			smallest = j;
			}
		}
		int temp = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = temp;

	}

	printArray(arr);*/


	for(int i = 1; a)




}
	

}