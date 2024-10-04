
import java.util.Scanner;

public class InvalidRollNoException extends java.lang.Exception {
    public String toString(){
        return "Roll number Should be in between 1 to 75 ! ";
    }
}

class Student {
    int rollNo ;
    String name;

    public Student (int rollNo, String name) throws InvalidRollNoException{
        try{
            if((rollNo <= 0)||( rollNo > 75)){
                throw new InvalidRollNoException();
            }
            this.rollNo = rollNo;
            this.name = name ;
        }
        catch(InvalidRollNoException invalid){
            System.out.println("Your entered Number is Invalid roll number should between in 1 to 75 : " + invalid);
        } 
        
    }

    public static void main(String args[]) throws InvalidRollNoException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your roll number or name ");
        int r = sc.nextInt();
        String na = sc.nextLine();
        try{
            Student obj = new Student(r, na);
        }catch( java.lang.Exception e){
            System.out.println("Exception is Occur");
        }
        
        System.out.println("One object is created");
    }

}
