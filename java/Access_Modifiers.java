class Access_Modifiers{
	public static void main(String [] args){
		
	Student s = new Student();
	s.setname("sakshi");
	s.setrollNo(11);		

	System.out.println(s.getrollNo());
	System.out.println(s.getname());

	}

   }



class Student {
	
	private int rollNo;
	private String name;
	
	public void setrollNo(int r){
	if ((r >= 101) && (r <= 170)){
	 rollNo = r;
	  }
	else {
	rollNo = 0;
	System.out.println("Your number has out of range !");
          
	}
	}
	
	public int getrollNo(){
	 return rollNo;
	}
	
	public void setname( String nm){
	name = nm;
	}
	
	public String getname (){
	return name;
	}

}
