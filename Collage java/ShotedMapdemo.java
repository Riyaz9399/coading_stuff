import java.util.*;

class Student implements Comparable {
    int rollNo;
    String name ;
     public Student(int rollNo , String name ){
        this.rollNo = rollNo;
        this.name = name ;
     }
    
     public int comapreTo(Object o){
        // Student s = (Student ) o;
        return Integer.compare(this.rollNo, rollNo);
     }

     public Student(){

     }
     public String toString(){
        return " Rool No ---> " + rollNo + "NAME --->" + name;
     }
}



public class ShotedMapdemo {
    public static void main(String [] args){
        // SortedMap <String,Integer> demo = new TreeMap< >();
        // System.out.println(demo.isEmpty());
        // demo.put( "sakshi",122);
        // demo.put( "priyam",234);
        // demo.put( "priyansh",45);
        // demo.put( "harsh",34);
        // demo.put( "krish",23);
        // demo.put( "Anshika",67);
        // System.out.println(demo);
        // System.out.println(demo.isEmpty());
        // System.out.println(demo.tailMap(" tail element  : " + "priyansh"));
        // System.out.println(demo.headMap("Head Aliment : " + "priyansh"));
        // System.out.println("The first Key  : " + demo.firstKey());
        // System.out.println("The last key : "+  demo.lastKey());

        SortedMap <Integer ,Student> student = new TreeMap<>();

        student.put(1,new Student(101,"sakshi"));
        student.put(2,new Student(102,"Neha "));
        student.put(3,new Student(103,"Kutta"));
        student.put(4,new Student(104,"haramkhor"));
        student.put(5,new Student(105,"Chikni"));
        
        System.out.println(student );

        SortedMap  <Student , Integer> student2 = new TreeMap<>();
        student2.put(new Student(101,"sakshi"), 101);
        student2.put(new Student(103,"sakshi"), 101);
        student2.put(new Student(102,"sakshi"), 101);
        student2.put(new Student(106,"sakshi"), 101);
        student2.put(new Student(104,"sakshi"), 101);
        student2.put(new Student(105,"sakshi"), 101);
        student2.put(new Student(107,"sakshi"), 101);
        System.out.println(student2 );

    }
}
