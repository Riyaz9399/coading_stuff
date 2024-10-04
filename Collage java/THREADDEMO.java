public class THREADDEMO extends Thread {
    public void run(){
        System.out.println("priority of the thread : " + Thread.currentThread() +  " is a " + getPriority());
    }

    public static void main(String args []){
        THREADDEMO obj1 = new THREADDEMO();
        obj1.setPriority(1);
        obj1.start();
    }
    
}
