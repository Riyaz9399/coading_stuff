
public class Initializer {

   public  Initializer(){
        System.out.println("IN side from Constructor");
    }

    {
        System.out.println("Initializer of the First block");
    }

    {
        System.out.println("Initializer of the Second block");
    }


    public static void main(String [] args){
        System.out.println("Main is started");
        Initializer i = new Initializer();
        // i.Initializer();
        System.out.println("END of the main");
        System.out.println("With the Two objectd");
        System.out.println();
        System.out.println("AGAIN Start Main");
        Initializer obj1 = new Initializer();
        System.out.println("Obj in mid way");
        Initializer obj2 = new Initializer();
        System.out.println("ENd of the main");


    }
}
