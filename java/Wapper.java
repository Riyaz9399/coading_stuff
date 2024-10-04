import java.util.*;

public class Wapper {
    static int average = 0;
    static int sum = 0;

    static int  Average(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            average = sum / arr.length;
        }
        return average;
    }

    public static void main(String [] args){

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Average(arr));

    }

}
