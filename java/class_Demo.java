class Student {

  	 int roll_number;
 	 String name;
 	 float marks;

	void setroll_number(int RN){
	roll_number = RN;
	}
	int getroll_number(){
	 return roll_number;
	}
	
	void setname(String nm){
	name = nm;
  	}
	String getname(){
	 return name;
	}

	void setmarks (float M){
	 marks = M;
	}
	
	float getmarks(){
	return marks;
	}

	String getGrade(){
	 if (marks < 35){
		return "fail";
	   }
	 return "pass" ;  
	}
	

	public static void main(String [] args){
	Student s = new	Student();
	s.setroll_number(101);
	s.setname("priyansh");
	s.setmarks(45.0f);
	
	System.out.println("roll number = "+ s.getroll_number());
	System.out.println("Name  = "+ s.getname());
	System.out.println("Marks = "+ s.getmarks());
	System.out.println("Grade of Student = " + s.getGrade());

 	System.out.println("--Second Object--");

	Student s1 = new Student();
	s1.setroll_number(102);
	s1.setname("harsh");
	s1.setmarks(98.02f);
	
	System.out.println("roll number = "+ s1.getroll_number());
	System.out.println("Name  = "+ s1.getname());
	System.out.println("Marks = "+ s1.getmarks());
	System.out.println("Grade of Student = " + s1.getGrade());
	}
	
}