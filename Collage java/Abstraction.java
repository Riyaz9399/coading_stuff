abstract class Aeroplane{
     abstract void  className();
}

class B747 extends Aeroplane{
    int seatingCapicity = 200;
    int serialNumber = 34;

    public String toString(){
        return "Seting Capacity : " + seatingCapicity + " serialNumber : " + serialNumber;
    }

    public void  className(){
        String className = this.getClass().getName();
        System.out.println(className);
    }

}
 class B757 extends Aeroplane{
    int seatingCapicity = 400;
    int serialNumber = 64;

    public String toString(){
        return "Seting Capacity : " + seatingCapicity + " serialNumber : " + serialNumber;
    }


    public void   className(){
        String className = this.getClass().getName();
        System.out.println(className);
    }

 }

 class B767 extends Aeroplane{
    int seatingCapicity = 700;
    int serialNumber = 94;

    public String toString(){
        return "Seting Capacity : " + seatingCapicity + " serialNumber : " + serialNumber;
    }


    public void  className(){
        String className = this.getClass().getName();
       System.out.println(className);
    }

 }


public class Abstraction {
    public static void main(String args[]){
        Aeroplane aeroplane ;

        for(int i = 0 ; i <= 5 ; i++ ){
            if(!(i % 2 == 0)){
                aeroplane = new B747();
                System.out.println(aeroplane);
                aeroplane.className();
            }

            else if(i % 2 == 0 ){
                aeroplane = new B757();
                System.out.println(aeroplane);
                aeroplane.className();
            }
            
                aeroplane = new B767();
                System.out.println(aeroplane);
                aeroplane.className();
            
        }

    }
    
}
