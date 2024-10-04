public class Clone {
    
}

class Rectangle implements  Cloneable{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void print(){
        System.out.println(length);
        System.out.println(width);
          
    }

    public static void main(String args[]){
        Rectangle r1 = new Rectangle(10,90);
        try{
        Rectangle r2 = (Rectangle) r1.clone();
        r1.print();
        r2.print();
        System.out.println(r1);
        System.out.println(r2);
    
        r2.length = 34;
        System.out.println("after modify the length");
        r1.print();
        r2.print();
        }
        catch(CloneNotSupportedException err){
            System.out.println(err);
        }
        }

}
