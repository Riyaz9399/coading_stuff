public class ToString {
    int length ;
    int width;

     public void set(int l , int w){
        length = l;
        width = w;
     }

     public void print(){
        System.out.println(length);
        System.out.println(width);
    }

    public String toString(){
        String mas;
        mas = "Length : " +  length  + " Width : "+ width;
        return mas;
    }
    public static void main(String [] args){
        ToString myobj = new ToString();
        myobj.set(80,20);
        // myobj.print();
        System.out.println(myobj); // return tostring value like this ToString@5acf9800
        System.out.println(myobj); // return tostring value like this ToString@5acf9800
        System.out.println(myobj);

    }

     
}


//  All the class are automatically inherited by object class of java which exists in the java.lang package of the java just like the scanner class exists in th java.util package 
