class Constructor{
	public static void main(String [] args){

	//Student s = new Student();
	//s.displayStudent();
	Student s1 = new Student(102,12.3f);
	s1.displayStudent();
	
  }
}

class Student {
	private int rollNo;
	private float marks;
	
	public Student(int r, float M){
	rollNo = r;
	marks = M;
	}
	public void displayStudent(){
	 System.out.println( "Roll No: "+ rollNo +" Marks : "+ marks);
	}
}
