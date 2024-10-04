import java.io.*;
import java.util.Date;

public class fileListingdemo {
    public static void main(String [] args){
        String dirname = args[0];
        File dirFile = new File(dirname);

        // if(!dirFile.isDirectory()){
        //     System.out.println(dirname  + "Is not a Directory");
        //     return;
        // }
        // for(String f : dirFile.list()){
        //     System.out.println(f);
        // }

        File []files = dirFile.listFiles();
        Date fileDate = new Date();
        for(File a_file : files){
            fileDate.setTime(a_file.lastModified());
            String content ;
            content = a_file.isDirectory() ? "<Dir>   ": "  " + a_file.length();
            System.out.println(fileDate + " \t " + content + "  " + a_file);
        }
    }
}
