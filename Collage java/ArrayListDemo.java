import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
    // ArrayList <String> list2 = new ArrayList<String>();

    // Add elements
    list.add(0);
    list.add(7);
    list.add(5);
    list.add(5);
    list.add(9);
    list.add(10);
   
    System.out.println(list);

    // GET element 

    System.out.println(list.get(2));

    // Add el in between

    list.add(1,3);
    System.out.println(list);

    // Set element 

    list.set(0,2);
    System.out.println(list);


    // Delete elements

    list.remove(3);
    System.out.println(list);

        // Size of the element 

       System.out.println(list.size()); 

        //  loops in arraylist;

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
