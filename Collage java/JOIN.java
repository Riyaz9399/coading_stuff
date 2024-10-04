import java.util.*;

import javax.sound.midi.SysexMessage;

public class JOIN extends Thread {
  int st ;
   
   JOIN(int st){
    this.st = st;
    start();
   }

   public void run(){
        try{
             for(int i = 1 ; i <= 10 ; i++){
                 System.out.println(getName() + " : " + i);
                 Thread.sleep(st);
             } 
         }catch(InterruptedException ie){
                 System.out.println(ie);
        }
   }



public static void main(String [] args){
    JOIN one = new JOIN(300);
    JOIN two = new JOIN(400);
    JOIN three = new JOIN(500);
    JOIN four = new JOIN(600);
   
    try{
        one.join();
        two.join();
        three.join();
        four.join();
    }catch(InterruptedException ie){

    }

    System.out.println("MAin is Exiting ");
    return;
}


}
