import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Program for read the binary data and write a binary data from the help of fileInputstream and fileoutput stream

public class IO{
    public static void main(String [] args){

        try{
            File f = new File("D://program//input.png");
            // Create input Stream
    
            FileInputStream input = new FileInputStream(f);
            byte b[] = new byte[(int)f.length()];
    
            int numBytes = input.read(b);
            System.out.println("Data from file Read SuccessFully");
    
            FileOutputStream output = new FileOutputStream("D://program//output.png");
            output.write(b);
            System.out.print("Data written Successuffuly !");
        }catch( IOException exc){
            System.out.println(exc);
        }
       
    }
    
}
