public class ExceptionmethodsDemo {
    public static void main(String [] args){
        try{
            int a = Integer.parseInt(args [0]);
            int b = Integer.parseInt(args [1]);
            int ans = a / b ;
            System.out.println("Sum of a anb b = " + ans);
        }catch(java.lang.Exception e){
            System.out.println("The exception is Occur " + e.getMessage());
            System.out.println("The exception is Occur " + e.getStackTrace());
            e.printStackTrace();
            e.getCause();
            // System.out.println("The exception is Occur " + e.getMessage());
            // System.out.println("The exception is Occur " + e.getMessage());

        }
    }
}
