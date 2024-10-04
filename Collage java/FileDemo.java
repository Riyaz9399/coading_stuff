import java.io.*;

public class FileDemo {
    public static void main(String [] args){
        File myfile = new File("C://Users//saksh//Documents//links.txt");
        System.out.println("My file Name : "+myfile.getName());
        System.out.println("The file path :"+myfile.getPath());
        System.out.println("The file parent name :" + myfile.getParent());
        System.out.println("The length of the file :" + myfile.length());
        System.out.println("The file is executable or not :" + myfile.canExecute());
        System.out.println("File last modify Time : " + myfile.lastModified());

        File f  = new File("D://program//one");

        if(f.mkdirs()){
            System.out.println("created on in program ");
        }else{
            System.out.println("Sorry check the path");
        }
    }

}
