import java.util.Scanner;

class Vehical{
    int noSeats;
    String fuel ;
    int speed;

    public  Vehical(int noSeats, String fuel,int speed){
        this.noSeats = noSeats;
        this.fuel = fuel;
        this.speed = speed;
    }

    public String toString(){
        return "NO of Seata : " + noSeats+ "Fuels Consumes : " + fuel + "Speed : " + speed;
    }

}

interface FlyingObject {
    int maxHeight = 20000;
    
    
}
class Aeroplane extends Vehical implements FlyingObject{
    
    int takeOffSpeed;
     public Aeroplane(int noSeats , String fuel , int speed , int takeOffSpeed){
        super(noSeats,fuel,speed);
        this.takeOffSpeed = takeOffSpeed;
     }

     public String toString(){
        String aeroprint ;
        aeroprint = "Atributes of Aeroplane";
        aeroprint = aeroprint + "NO of Seata : " + noSeats+ "Fuels Consumes : " + fuel + "Speed : " + speed;
        aeroprint = aeroprint + "Maximum Height : " + maxHeight ;
        aeroprint = aeroprint + "Take off speed : " + takeOffSpeed;
        return aeroprint;
     }
}


class Bus extends Vehical {
    String type;
    public Bus(int noSeats, String fuel, int speed, String type){
        super(noSeats, fuel, speed);
        this.type = type;
    }

    public String toString(){
        String Busprint ;
        Busprint = "Attributes of bus";
        Busprint = Busprint + "NO of Seata : " + noSeats+ "Fuels Consumes : " + fuel + "Speed : " + speed;
        Busprint = Busprint + "type Of bus :" + type;
        return Busprint;

    }

}

class Rocket extends Vehical implements FlyingObject{
    public Rocket( int noSeats, String fuel, int speed){
        super(noSeats, fuel, speed);

    }
}

public class InterfaceExample {
    public static void main(String [] args){
        Vehical v [] =  new Vehical[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Enter the 1 for Creation of bus and 2 for creation of Aeroplane and Create of rocket enter 3");
            int choice = sc.nextInt();
            if(choice == 1){
                int seats;
                String fuel;
                int speed;
                String type;
                System.out.println("Enter Seats , fuel , speed and type of bus ");
                seats = sc.nextInt();
                fuel = sc.next();
                speed = sc.nextInt();
                type = sc.next();

                v [i] = new Bus(seats , fuel, speed , type);
            }
            else if(choice == 2){
                int seats ;
                String fuel;
                int speed ;
                int takeOffSpeed;
                System.out.println("Enter the seats , fuels and speed , takeoffSpeed .. ");
                seats = sc.nextInt();
                fuel = sc.next();
                speed = sc.nextInt();
                takeOffSpeed = sc.nextInt();
                v[i] = new Aeroplane(seats, fuel, speed, takeOffSpeed);
            }
            else {
                int seats;
                String fuel;
                int speed ;
              
                System.out.println("Enter the , fuels and speed , .. ");
                seats = 4;
                fuel = sc.next();
                speed = sc.nextInt();
                v[i] = new Rocket(seats, fuel, speed);
            }
        }
        int count = 0;
        for(int i = 0 ; i < 4 ; i++){
            if(v[i] instanceof FlyingObject){
                count++;
                System.out.println(v[i]);
            }
            System.out.println("total Flying Objects are :"+  count);

        }

    }
}