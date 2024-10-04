
public class HasCode {

    public static void main(String [] args){
        Student s1 = new Student(102,"sakshi");
        System.out.println(s1);
        String hash_s1 = String.valueOf(s1.hashCode());
        System.out.println(hash_s1);
        System.out.println(s1.hashCode());
        System.out.println(Integer.toHexString(s1.hashCode()));
    }
    
}

class Student {
    int rollNo;
    String name ;

    public Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    // public String toString(){
    //     return "Roll no " + rollNo + "Name : " + name;
    //  }

    public  int hashCode(){
        return rollNo;
    }


}