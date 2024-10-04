import java.lang.*;


public class Daemon extends Thread{
    public void run(){
        try{
            System.out.println("In run Methods " + Thread.currentThread());
            while(true){
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ie){}

                System.out.println("In Run WOke up Again..");  
            }
        }
        finally{
            System.out.println("Living Run Method !");
        }
       
    }

   public static void main(String args[]){
    System.out.println("Starting The main Thread");
    Daemon obj1 = new Daemon();
    obj1.setDaemon(true);
    obj1.start();
    try{
        Thread.sleep(3000);
    }catch(InterruptedException ie){
        ie.printStackTrace();
    }
    System.out.println("Time up Existing now");
    
   } 
}
