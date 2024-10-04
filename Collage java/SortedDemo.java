import java.util.*;

class Student implements Comparable{
   
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString(){
        return "Roll No : " + rollNo + " , Student Name :  " + name ;
    }

    public int compareTo(Object an){
        Student s = (Student) an ;
        // return name.compareTo(s.name);
        if(this.rollNo == s.rollNo){
            return 0;
        }
        else if(this.rollNo < s.rollNo){
            return -1;
        }
        else{
            return 1;
        }
    }
}

public class SortedDemo {

    public static void main(String args []){
      TreeSet <Integer> student = new TreeSet<Integer>();
      student.add(10);
      student.add(58);
      student.add(34);
      student.add(23);
      System.out.println(student);
    //   Iterator <Integer> = new 
    student.add(11);
    student.add(3);
    student.add(11);

    System.out.println("after adding new element");
    System.out.println(student);
    TreeSet <Integer> header = (TreeSet<Integer>) student.headSet(30);
    System.out.println("Printing header");
    System.out.println(header);

    TreeSet <Integer> tailer = (TreeSet<Integer>) student.tailSet(30);
    System.out.println("Printing tail");
    System.out.println(tailer);

    System.out.println("Printing first");
    System.out.println(student.first());
    System.out.println("printing last");
    System.out.println(student.last());

    TreeSet <Student> collage = new TreeSet<Student>();

    Student s1 = new Student(101, "Sakshi");
    Student s2 = new Student(102,"vini");
    Student s3 = new Student(103,"Harsh");
    Student s4 = new Student(104,"priyansh");
    Student s5 = new Student(105, "krish");

    collage.add(s1);
    collage.add(s2);
    collage.add(s3);
    collage.add(s4);
    collage.add(s5);
    System.out.print(collage);
    // Iterator <Student> iter = iter.hasNext();
        
  


    }
    
}
