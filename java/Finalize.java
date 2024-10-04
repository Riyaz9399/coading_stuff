public class Finalize {
    protected void finalize(){
        System.out.println("Finalized method is call");

    }
    //  Constructor
    public Finalize(){
        System.out.println("Object is created..");
    }

    public static void main(String [] args){
        Finalize obj = new Finalize();
        obj = null;
        System.gc();
        System.out.println("Main Exiting");
    } 
}


