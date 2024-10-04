interface i{
    default  void f(){
        System.out.println("f is called..");
    }
    static void h(){
        System.out.println("H is from interface");
    }
}


public class Interface2  implements i{
    public static void main(String [] args){
        Interface2 obj = new Interface2();
        obj.f();
        i.h();
    }
}
