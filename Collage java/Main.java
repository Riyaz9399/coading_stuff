import java.rmi.server.ObjID;

class Overridding{
   void calc(int a ,int b){
    int c = a + b;
    System.out.println("Sum : " + c);
   }
}

class Child extends Overridding{
    void calc(int a , int b){
        int c = a * b;
        System.out.println("Multiply : " + c);
    }
}

class Main{
    public static void main(String args []){
        Child obj = new Child();
        Overridding obj1 = new Overridding();

        obj.calc(5,6);
        obj1.calc(5, 6);
    }
}