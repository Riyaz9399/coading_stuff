import java.util.*;

public class RunableInterface implements Runnable{
    Thread t ;

    public RunableInterface(String name){
        t = new Thread(this , name);
        t.start();
    }
    public void run(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(t.getName() + ": " + i);
        }
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }

    }


    public static void main(String args[]){
        RunableInterface ct1 = new RunableInterface("Thread one");
        RunableInterface ct2 = new RunableInterface("Thread two");
        RunableInterface ct3 = new RunableInterface("Thread Three");

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("MAIN thread :" + i);
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}
