class Employe{
    public static void main(String args[]){
        Inheritance emp1 = new Inheritance();
        FullTimeEmploye full1 = new FullTimeEmploye();
        emp1.setEmploye("123", "sakshi");
       emp1.printEmploye();
       full1.setFulltimeEmploye("123","neha" ,23456.24);
       full1.printEmploye();

    }
}

class Inheritance{

   private String empId;
   private String empName; 

   public void setEmploye(String empId, String empName){
    this.empId = empId;
    this.empName = empName;
   }

   public void printEmploye(){
    System.out.println("Employe Id : " + empId);
    System.out.println("Employe Name : " + empName);
   }

    
}

class FullTimeEmploye extends Inheritance{
   private double salary ;

   public void setFulltimeEmploye(String empId, String empName,double salary){
    setEmploye(empId, empName);
    this.salary = salary;
   }

   public void printFullTimeEmploye(){
    printEmploye();
    System.out.println("Employe Salary : " + salary);
   }
}

