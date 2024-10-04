class Queue{
    int item;
    boolean busy = false;
    synchronized int get(){
        if(!busy){
            try{
                wait();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        System.out.println("Get :" + item);
        busy = false;
        notify();
        return item;
    }

    synchronized void put(int item){
        if(busy){
            try{
                wait();
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        this.item = item;
        busy = true;
        System.out.println("Put :" + item);
        notify();
    }

}

class Producer extends Thread{
    Queue q;
    Producer(Queue q){
        this.q = q;
    } 

    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
        }
    }

}


class Consumer extends Thread{
    Queue q ;
    Consumer (Queue q){
        this.q = q;
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}


public class THREADCOMMUNICATION{
    public static void main(String args[]){
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        System.out.println("press Ctrl+ C to stop");
        p.start();
        c.start();
    }
}