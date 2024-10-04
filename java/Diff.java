// public class Diff {
    
// }
//  abstract  class FinalClass{
//     public FinalClass(){
//         System.out.println("Hello Final and Abstract");
//     }
//     abstract final void f(){
//         System.out.println("f() called..");
//     } 
// }

// class Derived extends FinalClass{
//     abstract final public void f(){
//         System.out.println("saksi");
//     }
// }

// class AbstractFinalDemo {
//     public static void main(String [] args){
//         // FinalClass obj = new FinalClass();
//         // obj.f();

//     }
// }

 abstract class Base{
    abstract public void f();
    public void g(){
        System.out.println("g is called ");

    }

    public void h(){
        System.out.println("the h is called from the base class");
    }
}

class Derived extends Base{
    public void f(){
        System.out.println("f from the Derived ");
    }

     public void g(){
        System.out.println("hii g from the Derived");
    }

    public  void h(){
        System.out.println("H from Derived !");
    }
}

class AbstractFinal {
    public static void main(String [] args){
        Derived obj = new Derived();
        obj.f();
        obj.g();
        obj.h();
    }
}