// Default Constructor are called when we create a object of the derived class so the base class constructor is automatically called.
// pareterized constructor are constructor when we create a object of the class so it can not call the base class constructer itself.
// constructor in multilevel 


public class ConstructorInJava {
    public static void main(String [] args){
        Base B1 = new Base(10);
        Derived obj = new Derived(10,20);
        obj.PrintIJ();
        B1.PrintI();
    }
}

class Base {
    protected int i ;
    public void PrintI(){
        System.out.println(i);
       
    }
    // public Base(){
    //     System.out.println("Deafault constructor Called..");
    //     i = 10;
    // }

    public Base(int i){
        System.out.println("Base parameterized constructor called..");
        this.i = i;
    }
}

class Derived extends Base {
    int j ;
    public void PrintIJ(){
        super.PrintI();
        System.out.println(j);
    }

    public Derived(int i ,int j){
        super(i);
        System.out.println("Derived Constructor is Called..");
        this.j = j;
        // super(i);
       
    }
}