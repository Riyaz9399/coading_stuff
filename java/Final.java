public class Final {
    public static void main(String [] args){
        // Base b1 = new Base();
        // b1.print();
        Derived d1 = new Derived();
        d1.print();
    }
}

class Base {
    // protected final int F_i ;
    // protected int j ;
    

    // {
    //     F_i = 10;
    //     j = 20;
    // }

        Base(){
            System.out.println("The Base Created");
            // F_i = F_i * 10;
            // j = j * 10;
            // this.F_i = F_i;
            // this.j = j;
        }
        
       final public void print(){
            System.out.println("Hello from base ");
            // System.out.println(j);
        }

}

class Derived extends Base{
   Derived (){
    System.out.println("Derived Created");
   }

  public void print(){
    System.out.println("Hello from Derived ");
   }
}