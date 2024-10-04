import java.util.*;


public class CustomThread extends Thread {


   public CustomThread(String name){
      super(name);
   }
   public void run(){
      for(int i = 1 ; i <= 10; i++){
         System.out.println(getName() + ": "+ i);
         try{
            Thread.sleep(300);
         }catch(InterruptedException ieo){
            ieo.printStackTrace();
         }
      }
   }
   public static void main(String [] args){
     CustomThread Ct1 = new CustomThread("Thread One");
     CustomThread Ct2 = new CustomThread("Thread two");
     CustomThread Ct3 = new CustomThread("Thread Three");
     Ct1.start();
     Ct2.start();
     Ct3.start();

     for(int i = 0 ; i <= 10 ; i++){
      System.out.println("Main Thread : " + i);
      try{
         Thread.sleep(300);
      }catch(InterruptedException ieo){
         ieo.printStackTrace();
      }
     }
   } 
}
