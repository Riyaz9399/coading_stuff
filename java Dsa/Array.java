import java.util.*;

public class Array{
    public static void main(String[] args){
        System.out.println("Enter your size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       int[] numbers = new int[size];
      
      for(int i = 0 ; i < size ; i++){
        numbers[i] = sc.nextInt();
      }
      System.out.println("enter the number which you what to search");
      int x = sc.nextInt();
      for(int i = 0 ; i < size ; i++){
        if(numbers[i] == x){
            System.out.println("The x value is found at "+i);
        }
      }
    }
}