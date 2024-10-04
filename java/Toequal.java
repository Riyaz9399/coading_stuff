public class Toequal {
    public static void main(String [] args){
        Rectangle r1 = new Rectangle(12,45);
        Rectangle r2 = new Rectangle(12,905);
        r1.print();
        if(r1.equals(r2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}

class Rectangle{
    int length ;
     int width;
     public Rectangle(int length , int width){
        this.width = width;
        this.length = length;
     }
     public void  print(){
        System.out.println("Rectangle length = " + length);
        System.out.println("Rectangle width = "+ width);
     }

     public boolean equals(Object obj){
        Rectangle r = (Rectangle) obj;
        if (this.length == r.length && this.width == r.width){
            return true;
        }
        else {
            return false ;
        }

     }
}
