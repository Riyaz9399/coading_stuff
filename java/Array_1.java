class Array_1{
	public static void main (String [] args){
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0; i < arr.length;i++){
	System.out.println(arr[i]);
	}
	
	int age[];
	age = new int[5];
	age[0] = 20;
	age[1] = 34;
	age[2] = 27;
	age[3] = 32;
	age[4] = 29;
	int sum = 0 , count = 0;
	for (int i = 0; i < age.length;i++){
		
		if(age[i] >= 30){
		System.out.println(age[i]);	
		   count++;
		}
	 System.out.println("Age int this index : " + age[i]);
	System.out.println(sum += age[i]);
		}
	System.out.println("Sum of the given age! :" + sum);
 	System.out.println(" Count of the age which are 30 above : "+count);
   }
}