import java.util.*;

public class CollectionFramework {

    static Student arr[]= new Student[10];
    static Student s;
    public static void main(String args[]){
        ArrayList <Student> tab1 = new ArrayList<Student>();
        // From array to list
        getData(arr);
        for(int i = 0 ; i < arr.length ; i++){
            tab1.add(arr[i]);
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(tab1.get(i));
        }

        tab1.add(5,new Student(11, "sakshi"));
        System.out.println(tab1);


        Iterator iter = tab1.iterator();
        System.out.println("Traversing with Iterator!");

        while (iter.hasNext()){
            Student s = (Student) iter.next();
            System.out.println(s);
        }

        //  from list to array 
        Student [] obj1 = new Student [17];
        Student [] obj2 = (Student [])  tab1.toArray(obj1);

        if(obj1 == obj2){
            System.out.println("Obj1 and obj2 are same ");
        }
        else{
            System.out.println("obj1 and obj 2 are not same ");
        }

            List <Student> sub1 = tab1.subList(2, 5);
            ListIterator <Student> li = sub1.listIterator();

            System.out.println("Forword transveral of sublist ");
            while (li.hasNext()){
                Student s = li.next();
                System.out.println(s);
            }
            System.out.println("BackWord transwarsal");
            while (li.hasPrevious()){
                Student s = li.previous();
                if( s.rollNo == 4){
                    li.remove();
                }
                System.out.println(s);
            }
            System.out.println(sub1);

    }
    static void getData(Student [] A){
        A[0] = new Student(1,"sakshi");
        A[1] = new Student (2,"Vini");
        A[2] = new Student (3,"krish");
        A[3] = new Student (4,"anishak");
        A[4] = new Student (5,"Vinishaka");
        A[5] = new Student (6,"Vansh");
        A[6] = new Student (7,"Vinayak");
        A[7] = new Student (8,"Viniy");
        A[8] = new Student (9,"harsh");
        A[9] = new Student (10,"Priyam");
        
    }
    
}



class Student {
    int rollNo;
    String name ;

    public Student (int rollNo , String name ){
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return "Roll Number :" + rollNo + " NAME : " + name;
    }
}
