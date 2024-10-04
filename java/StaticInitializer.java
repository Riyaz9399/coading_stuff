

public class StaticInitializer {

    public int i = 0;
    static public int j = 0;
    public static void main(String args[]){
        System.out.println("main Started");
        StaticInitializer obj1 = new StaticInitializer();
        System.out.println("Main End");
    }

    {
        i++;
        System.out.println("Initializer block 1 : " + i);
    }

    {
        i++;
        System.out.println("Initilazer Block 2 : " + i);
    }

    public StaticInitializer(){
        i++;
        System.out.println("The constructer : " + i);
    }

    static {
        j++; // this gives error because the object is not created now you can only access static variable in static block
        System.out.println("The static block Initilazer 1 : "  + j);
    }
    static {
        j++;
        System.out.println("The static block Initilazer 2 : " + j);
    }

}
