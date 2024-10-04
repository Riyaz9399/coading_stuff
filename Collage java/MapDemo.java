import java.util.*;

class Student {
    int rollNo;
    String name ;

    public Student(int rollNo , String name){
        this.name = name ;
        this.rollNo = rollNo;
    }

    public Student(){

    }

    public String toString(){
        return "Roll number : " + rollNo + " , Name : "  +  name ;
    }


}

public class MapDemo{

    public static void main(String [] args){
        Student s1 = new Student(101,"sakshi");
        Student s2 = new Student (102, "vini");
        Student s3 = new Student(103,"harsh");
        Student s4 = new Student (104,"Priyam");

        Map<Integer ,Student>  student = new HashMap<Integer,Student>(); 
            student.put(1,s1);
            student.put(2,s2);
            student.put(3,s3);

            for(int i = 0 ; i < student.size(); i++){
                Student s;
                s = student.get(i + 1);
                System.out.println(s);
            }

            // Set student_Keys = student.keySet();
            // System.out.println(student_Keys);
            System.out.println("All the keys are "+ student.keySet());
            System.out.println("All the values are " + student.values());
            student.put(4,s4);
            System.out.println(student);

           Set <Map.Entry<Integer,Student>> enteries_student = student.entrySet();

           Iterator<Map.Entry<Integer,Student>> iter = enteries_student.iterator();

            while (iter.hasNext()) {
               Map.Entry<Integer,Student> Kvpair = iter.next();
               Integer key = Kvpair.getKey();
               Student s = Kvpair.getValue();
               System.out.println(key + "----> " + s);

            }
            System.out.println(student.isEmpty());


    }
}