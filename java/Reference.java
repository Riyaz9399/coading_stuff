class Reference {
	public static void main(String [] args){
	Employee e[] =  new Employee[5];

	for(int i = 0 ; i < 5; i++){
	 e[i] = new Employee();
	e[i].setEmployee(i,1000*(i+1));
	}

	/*for(int i = 0; i < 5; i++){
	 e[i].printEmployee();
	}*/
	e[3].printEmployee();

	for(int i = 0 ;i < e.length ; i++){
	 if(e[i].getEmployee() < 1500){
	 System.out.println("bonous Rs .3000");
	 }
	else {
	 System.out.println("bonous is Rs .1000");
	}
	
	}
}
}

class Employee{
 private int empId;
 private float salary;


 public void setEmployee(int id ,float s){
  empId = id;
   salary = s;	
 }

 public void printEmployee(){
   System.out.println("Employee ID : " + empId +" Employee salary " + salary);

 }
 public float getEmployee(){
   return salary;
 }

}