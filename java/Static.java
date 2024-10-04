public class Static {
    public static void main(String [] args){
        // static is used with the nested  blocks ,class  , 
        // static variable  --> gives the memory to the a variable when class loads 
        //  memory allocation when the objects are created that store different references for the particular object

        // static keyword when you want to same value to a differnt object 

        // object  = null  for the garbage collector
        // class variable is same as static variable because this is not the instance of the class with the help of static keyword 

        // static methods
        // call the method --> class_name.methodname 
        // do not call static methods with object name 
        //  you can not use this or super keyword in static keyword in static methods 
        // static methods only call static methods like main method or static method

        Student.setPassingMarks(33);
        Student s1 = new Student();
        s1.set(101,80);
        s1.display();
        Student s2 = new Student();
        s2.set(102, 24);
        s2.display();


    }
}

class Student {
    int rollNo;
    static int passingMarks;
    float marks;

   public static void setPassingMarks(int pm){
    passingMarks = pm;
    }

    public void set(int rollNo , float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display(){
        System.err.println("Roll no " + rollNo);
        System.err.println("Passing MArks " + passingMarks);
        System.err.println("Marks " + marks);
        if(marks > passingMarks){
            System.out.println("GRADE A " + marks );
        }else{
            System.out.println("Fail " + marks);
        }

    }
}
