public class Super {
  public static void main(String [] args){

    Base B1 = new Base();
    Derived D1 = new Derived();
    D1.printIJ();

  }   
}

class Base {
    private int i ;
    Base(){
        i = 10;
    }

    void printI(){
        System.out.println(i);
    }
}

class Derived extends Base {
    private int j ;
    Derived(){
    //    super.i = 90;
       super();
        this.j = 20;
    }
    
    void printIJ(){
       super.printI();
       System.out.println(j);

    }
}