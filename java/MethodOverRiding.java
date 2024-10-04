import java.util.*;



public class MethodOverRiding {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for batsMans or Enter 2 for Boller");
        int choice = sc.nextInt();
        sc.close();
        Cricket c ;
        if(choice == 1){
            c = new Batsman("India" , "Rohit Sharma" , 4,2);
        }
        else {
            c = new Boller("Pakistan","Harsh",3,6);
        }

        c.printPlayer();




    }
}

class Cricket{
    String countryName;
    String playerName;

    Cricket(String countryName,  String  playerName){
        this.countryName = countryName;
        this.playerName = playerName;
    }
    public void printPlayer(){
        System.out.println("The Country Name of the player : " + countryName);
        System.out.println("The name of the player is :" + playerName);
    }

}

class Batsman extends Cricket{
     int num1 ;
     int num2 ;

    public Batsman(String countryName, String playerName , int num1 , int num2 ){
        super(countryName,playerName);
        this.num1 = num1;
        this.num2 = num2;
    }
    public void printPlayer(){
        super.printPlayer();
        System.out.println("The number of the batsmans are : " + num1);
        System.err.println("The number of The Bats Mans are " + num2);

    }
}

class Boller extends Cricket{
    int num1 ;
    int num2 ;
     public Boller(String countryName , String playerName , int num1 , int num2){
        super(countryName, playerName);
        this.num1 = num1 ;
        this.num2 = num2;
     }

     public void printPlayer(){
        super.printPlayer();
        System.out.println("The number of the Bollars are  : " + num1);
        System.out.println("The number of the boller two are : " + num2);
     }

     
}