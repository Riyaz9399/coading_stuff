import java.util.*;

public class Array2D{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the collumn");
        int col = sc.nextInt();
        int array[][]  = new int[rows][col];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j <  col ; j++){
                array[i][j] = sc.nextInt();
            }
            
        }

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.println(array[i][j] + "");
            }
           System.out.println();
        }
    }
}
