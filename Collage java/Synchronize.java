import javax.swing.plaf.synth.SynthLookAndFeel;

class Parenthesis{
   synchronized void display(String s){
        System.out.println("\n");
        System.out.print("(" + s);
        try{
            Thread.sleep(500);
        }catch(InterruptedException ie){}
        System.out.println(")");
    }
}

public class Synchronize extends Thread {
    String s ;
    Parenthesis p;
    
    public Synchronize(Parenthesis p , String s){
        this.p = p;
        this.s = s;
        start();
    }

    public void run(){
        p.display(s);
    }

    public static void main(String [] args){
        Parenthesis p = new Parenthesis();
        Synchronize obj = new Synchronize(p, "Java");
        Synchronize onj1 = new Synchronize(p, "OOCP");
    }

}
