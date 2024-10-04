import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.xml.stream.events.StartDocument;

public class Alivedemo extends Thread {
    Alivedemo(){
        start();
    }

    public void run(){
        try{
            System.out.println(getName() + "Says Hello " );
            Thread.sleep(500);
            System.out.println(getName() + "Says Bye " );
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    public static void main(String [] args){
        Alivedemo obj0 = new Alivedemo();
        Alivedemo obj1 = new Alivedemo();
        Alivedemo obj2 = new Alivedemo();
        Alivedemo obj3 = new Alivedemo();

        System.out.println(obj0.getName() + " is alive : "+ obj0.isAlive());
        System.out.println(obj1.getName() + " is alive : "+ obj1.isAlive());
        System.out.println(obj2.getName() + " is alive : "+ obj2.isAlive());
        System.out.println(obj3.getName() + " is alive : "+ obj3.isAlive());
        System.out.println("Main Thread IS sleeping for 2000 Mili seconds");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
        System.out.println(obj0.getName() + " is alive : "+ obj0.isAlive());
        System.out.println(obj1.getName() + " is alive : "+ obj1.isAlive());
        System.out.println(obj2.getName() + " is alive : "+ obj2.isAlive());
        System.out.println(obj3.getName() + " is alive : "+ obj3.isAlive());


    }

}
