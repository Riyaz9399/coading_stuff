class Rectangle {
    int length ;
    int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;

    }

    public String toString(){
        return "Height : " + length + "width : " + width ;
    }
}


class Room extends Rectangle{
    int height;

    public Room(int length,int width,int height){
        super(length,width);
        this.height = height;
    }

    public String toString(){
        return "height : " + height + " Width : " + width + " length : " + length ;
    }

}


public class Area {

    public static void main(String args[]){
        Rectangle a = new Rectangle(12,23 );
        Room room = new Room(12, 23,34);
        System.out.println(a);
        System.out.println(room);

        
    }
    
}
