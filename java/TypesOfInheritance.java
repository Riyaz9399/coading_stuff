public class TypesOfInheritance {
    public static void main(String args[]){
        Person p1 = new Person();
        Employe e1 = new Employe();
        FullTimeEmploye f1 = new FullTimeEmploye();
        p1.setPerson("neha", "punjabi colony");
        e1.setEmploye("103", "Engerning deprtment", "vini jain", "Krishnagar");
        f1.setFulltimeEmploye("sakshi", "dalibaba satna ", "101", "It department", 75000.00);
        p1.displayPerson();
        e1.displayEmploye();;
        f1.displayFullTimeEmploye();
    }
}

class Person {
    protected String name;
    protected String address;

    public void setPerson (String name , String address){
        this.name = name;
        this.address = address;
    }

    public void displayPerson(){
        System.out.println("Person name :" + name);
        System.out.println("Person Address : " + address);
    }
}

class Employe extends Person{
    protected String empId ;
    protected String department;

    public void setEmploye(String empId , String department , String name , String address ){
        setPerson(name, address);
        this.empId = empId;
        this.department = department;
    }

    public void displayEmploye(){
        displayPerson();
        System.out.println("Id of employe : " + empId);
        System.out.println("The department of Employe  : " + department);
    }

}


class FullTimeEmploye extends Employe{
    protected double salary;

    public void setFulltimeEmploye(String name , String address , String empId , String department , double salary){
        setEmploye(empId, department, name, address);
        this.salary = salary;
    }

    public void displayFullTimeEmploye(){
        displayEmploye();
        System.out.println("The salary of the Full time Employe : " + salary);
    }

}


// class PartTime extends Employe{

// }