import java.util.*;


 abstract class Animal {
  abstract  public  void makeSound();
}

class PetAnimal extends Animal{
    public void getType(){
        System.out.println("This is a pet animal ");
    }
    public void makeSound(){
        System.out.println("This is pet animal !");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("BOW...WOW");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("miu miu...");
    }
}

class Abstract {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 1 for Dog and 2 for cat");
        int choice = sc.nextInt();
        Animal a ;
            
       

        if(choice == 1){
            a = new Dog();
           a.makeSound();
        }
        else {
            a = new Cat();
            a.makeSound();
        }

        a = new PetAnimal();
        a.makeSound();
    }
}

