This is the end of the filedisplay(){
    System.out.println("Hii from Bond");
  }
}

class ConvertibleBond extends Bond{
    public void display(){
        System.out.println("Hii from Convertible Bond");
    }
}




public class Inheritance {
    public static void main(String args []){
        Bond arr ;

        for(int i = 0 ; i <= 10; i++){
            if( i % 2 == 0){
                arr = new ConvertibleBond();
                arr.display();
            }
            else{
                arr = new Bond();
                arr.display();
            }
        }
    }
}
