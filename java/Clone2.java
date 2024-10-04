public class Clone2 {
    
}

class Name{
    String firstName ;
    public Name(String fnm){
        firstName = fnm;
    }

    public void  SetName(String fnm){
        firstName = fnm;

    }
    public String print(){
        return firstName;
    }

}


class Student implements Cloneable{
    int rollNo;
    Name studentName ;

    Student (int rollNo , String fnm ){
        this.rollNo = rollNo;
        this.studentName = new Name(fnm);
    }

    public void setName(String fnm){
        this.studentName.SetName(fnm);
    }

    public Object clone() throws CloneNotSupportedException{
        Student temp = (Student) super.clone();
        return temp;
    }
    public static void main(String args[]){
        try{
            Student s1 = new Student(101,"sakshi");

            Student s2 = (Student) s1.clone();
            System.out.println(s1.rollNo);
        }
        catch(ClassCastException err){
            System.out.println(err);
        }

    }

}