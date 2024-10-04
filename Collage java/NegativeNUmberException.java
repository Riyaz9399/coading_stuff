public class NegativeNUmberException extends java.lang.Exception{
  public String toString(){
    return "Please enter only positive number for the operation!";
  }   
}

class User{
    int rollno ;
    String name;

    public User (int rollno , String name) {
        try{
            if(rollno < 0){
                throw new NegativeNUmberException();
            }
        }
        catch(java.lang.Exception e){
            System.out.println("Please provide a Positive number only");
        }
        this.rollno = rollno;
        this.name = name ;
       
    }

    public String toString(){
        return "ROll no :" + rollno + "Name : " + name;
    }

    public static void main(String args[]){
        int rollno = Integer.parseInt(args[0]);
        String name = "sakshi";
        try{
            User one = new User(rollno,name);
            System.out.println(one);
        }
        catch(NegativeArraySizeException e){
            System.out.println("Exception is occur" + e);
        }
       
       
       
    }
    
   
}
