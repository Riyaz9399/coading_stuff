import java.util.*;
import java.lang.*;

public class Swaap {

    static void swap(int x, int y){
     int temp ;
     temp = x;
     x = y;
     y = temp;
     System.out.println( x + " " +y);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1,num2);
       

    }
}
