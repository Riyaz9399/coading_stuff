import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


 class Demo implements Serializable {
    int rollNo;
    String name;

    public Demo(int rollNo , String name){
        this.name = name ;
        this.rollNo = rollNo;
    }

    public String toString(){
        return rollNo + "-----> " + name ;
    }
    
}


public class Serilazable  {
    public static void main(String [] args){
        try{
            FileOutputStream fos = new FileOutputStream(args[0]);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            Demo s[] = new Demo[5];

            s[0] = new Demo(101,"Sanjh");
            s[1] = new Demo(102, "neha");
            s[2] = new Demo(103,"Sakshi");
            s[3] = new Demo(104, "harsh");
            s[4] = new Demo(105, "Vini");

            for(int i = 0 ; i< 5 ; i++){
                oos.writeObject(s[i]);
            }
                    oos.flush();
                oos.close();
                fos.close();

            // Reading from file 



        }catch(IOException exc){
            System.out.println("The exception is occure");
        }


    try{
        Demo s ;
        FileInputStream fis = new FileInputStream(args[0]);
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (fis.available() > 0){
            s = (Demo) ois.readObject();
            System.out.println(s);
        }

    }catch(IOException exc){
        exc.printStackTrace();
    }catch(ClassNotFoundException cls){
        cls.printStackTrace();
    }


        
    }
}