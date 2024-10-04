import javax.print.DocFlavor.STRING;

abstract class Mammal {

}

interface Vechical {
    abstract String Drive();
}

class Bear extends Mammal{

}

class Elephant extends Mammal implements Vechical{
    public String Drive(){
        return "Elephant is use for Ridding ";
    }
}

class Horse extends Mammal implements Vechical{
    public String Drive(){
        return "Horse is use for Ridding ";
    }
}

class Lion extends Mammal{

}

public class Animal {
    
}
