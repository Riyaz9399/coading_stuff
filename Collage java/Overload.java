public class Overload {
    public void   volume(int side ){
        int cube = side * side  * side;
        System.out.println("Volume of Cube : " + cube);
    }

    public void volume(int h,int w, int l ){
        int cuboid = h * w * l;
        System.out.println("volume of Cuboid : " + cuboid);
    }

    public static void main(String [] args){
        Overload obj = new Overload();
        obj.volume(3);
        obj.volume(2,3,4);
    }
}
