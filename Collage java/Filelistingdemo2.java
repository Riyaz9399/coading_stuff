import java.io.*;
import java.util.Date;


class FilterExt implements FilenameFilter{
    String ext;
    public FilterExt(String ext){
        this.ext = ext;
    }
    public boolean accept(File dir , String name ){
        return name.endsWith(ext);
    }
}

public class Filelistingdemo2 {
   public static void main(String args[]){
     FilenameFilter only  = new FilterExt("java");
     String dirnName = args[0];

     File mydir = new File(dirnName);
     if(mydir.isDirectory()){
        File[] files = mydir.listFiles(only);
        for(File a_file : files){
            System.out.println(a_file.getName());
            
        } 
        System.out.println("total length of the file : " + files.length);
     }else{
        System.out.println(" Not a directory !");
     }

   } 
}
