abstract class Fruit {
    abstract String  className();
}

class Apple extends Fruit{

   public String  className(){
    String ClassName = getClass().getName();
    return "Class Name : " + ClassName;
   }

}

class Watermelon  extends Fruit{

    public String  className(){
        String ClassName = getClass().getName();
        return "Class Name : " + ClassName;
    }

}

class Mango extends Fruit{

    public String  className(){
        String ClassName = getClass().getName();
        return "Class Name : " + ClassName;
    }

}





public class Fruits {

    public static void main(String args[]){
        Fruit obj ;
         obj = new Watermelon();
         System.out.println(obj.className());

        for(int i = 1 ; i <= 10 ; i++){
            if( i % 3 == 0){
                obj = new Apple();
                System.out.println(obj.className());
            }
            else{
                obj = new Mango();
                System.out.println(obj.className());
            }

        }
    }
    
}
