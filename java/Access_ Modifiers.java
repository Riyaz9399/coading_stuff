class Access_Modifiers{
	public static void main(String [] args){
		
	Student s = new Student();
	s.setname("sakshi");
	s.setrollNo(101);

	System.out.println(s.getname());
	}

   }



class Student{
	
	private int rollNo;
	private String name;
	
	public void setrollNo(int r){
	 rollNo = r;
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
