class Array_Cloning{
	public static void main(String [] args){
	
	char [] copyFrom ={'j','a','v','a',' ','i','s',' ','F','u','n'};
    	
	char [] copyTo = new char[10];
	copyTo[0] = 'E';
 	copyTo[1] = 'N';
	copyTo[2] = 'J';
	copyTo[3] = 'O';
	copyTo[4] = 'Y';
	copyTo[5] = ' ';
	System.arraycopy(copyFrom,8,copyTo,6,3);
	System.out.println(copyTo);

    }
}