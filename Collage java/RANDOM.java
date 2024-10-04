import java.io.IOException;
import java.io.RandomAccessFile;

public class RANDOM {
    public static void main(String [] args){
        try{
            String filepath = args[0];
            RandomAccessFile f = new RandomAccessFile(filepath,"rw");
            byte [] data = new byte[(int) f.length()];
            f.read(data);
            System.out.println("To orignal content of file is : "  + new String(data) );
            f.seek(0);
            f.write("This is a java.exc File ".getBytes());
            f.write("This is the end of the file".getBytes());
            f.seek(0);

            byte [] Mofidata = new byte[(int) f.length()];
            f.read(Mofidata);
            System.out.println("Modify Content :" + new String(Mofidata));
        }
        catch(IOException exc){
            System.out.println(exc);
            exc.printStackTrace();

        }
    }
}
