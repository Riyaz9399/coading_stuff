import javax.sound.sampled.SourceDataLine;

interface A{
    int num = 5;
    void show();
 }
 interface B{
    void sum();
 }

 class C implements A, B{
  public void show(){
    System.out.println("message from A interface");
 }

  public void sum(){
    System.out.println("Message from B interface");
 }
 }

public class Multipal extends C {
    public static void main(String[] args){
        C onj = new C();
        onj.show();
        onj.sum();
    }
}
