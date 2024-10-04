/**
 * Interface
 */
interface I {
    int no = 10;
    void f();
}
interface I2{
    int no2 = 10;
    void g();
}

class Base {
    void h(){
        System.out.println("Base class called...");
    }
}


class Demo extends Base implements I,I2{
    public static void main(String [] args){
        Demo obj = new Demo();
        obj.f();
        obj.g();
        obj.h();
        
    }
    public  void f(){
        
        System.out.println("sakshi : " + no );
    }
    public void g(){
    System.out.println("G called " + no2);
    }
}