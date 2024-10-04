import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOWRITER {
    public static void main(String [] args){
        FileReader fin ;
        FileWriter fout;
        int c ;

        if(args.length != 2){
            System.out.println("please provid 2 file names");
            return;
        }

            try{
                fin = new FileReader(args[0]);
                fout = new FileWriter(args[1]);

                do{
                    c = fin.read();
                    if(c != -1){
                        fout.write(c);
                    }
                }while(c != -1);
                System.out.println("File coppied Successefully");
                fin.close();
                fout.close();

            }catch(IOException exc){
                System.out.println("The Exception is occur" + exc);

            }
    }
    
}
