import java.io.*;

public class TypesofexceptionDemo {
    public static void main(String [] args) throws Exception{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Answer is " + (a/b));
        if((a == 0) || (b == 0)){
            throw new Exception();
        }

        // try{
        //     FileInputStream f = null;
        // f = new FileInputStream("C:/Users/saksh/Desktop/Collage java/dummy.txt");
        // int m;
        // while ((m = f.read()) != -1){
        //     System.out.print((char) m);
        // }
        // f.close();
        // }
        // catch(FileNotFoundException file){
        //     System.out.println("File not find Exception: "+  file );
        // }
        // catch(java.lang.Exception e){
        //     System.out.println("please the check the file " + e);
        // }
        
        
    }
}
