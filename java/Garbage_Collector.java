class Garbage_Collector{
	/*public void finalize(){
		System.out.println("Object Destroued");
}*/
	public static void main(String [] args){
         Garbage_Collector gcd1 = new Garbage_Collector();
	Garbage_Collector gcd2 = new Garbage_Collector();
	gcd1 = null;
	gcd2 = null;
	
	System.out.println("Objects Assiged Null");
	System.gc();
	
  }
}