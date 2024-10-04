import java.util.*;

public class findX {
    public static void main(String args[]){
       Scanner sc  = new Scanner(System.in); 
       int rows = sc.nextInt();
       int col = sc.nextInt();

       int array[][] = new int[rows][col];

       for (int i = 0 ; i < rows ; i++){
        for (int j = 0 ; j < col ; j++){
            array[i][j] = sc.nextInt();
        }
       }
       System.out.println("Enter the value which you want to find");
       int x = sc.nextInt();

       for (int i = 0 ; i< rows ; i++){
        for (int j = 0; j < col ; j++){
            if(array[i][j] == x){
                System.out.println("The x is found at [" +i + "]["+j + "]index");
            }
        }
       }
    }
}
