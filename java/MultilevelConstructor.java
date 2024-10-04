

public class MultilevelConstructor {
    public static void main(String [] args){
        C onj = new C(10);
        
    }
}
class A{
    public A(int k){

        System.out.println("A class Constructor called...");
        System.out.println(k);
    }
}

class B extends A{
    public B(int j){
        super(30);
        System.out.println("B Class Constructor called...");
        System.out.println(j);
        
    }
}

class C extends B{
    public C(int i){
        super(20);
        System.out.println("C class constructor Called..");
        System.out.println(i);
    }
}