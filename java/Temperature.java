import java.util.*;




public class Temperature {

    static int sum = 0 ;
    static int average = 0;
    static int count = 0;


    static int Average(int arr[][]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                sum += arr[i][j];
                count++;
            }
        }

        average = sum / count;
        return sum ;

    }


    public static void main(String args[]){
        int week = 2;
        int days = 7;
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[week][days];
        for(int i = 0 ; i < week ; i++){
            for(int j = 0 ; j < days ; j++){
                arr[i][j] = sc.nextInt();
            } 
        }
        System.out.println(Average(arr));
    }
}
