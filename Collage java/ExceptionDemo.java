import java.io.*;

public class ExceptionDemo {
//   public static void main(String args[]){
//     int a = 10;
//     int b = Integer.parseInt(args[0]);
//     try {
//         int c = a/b;
//         System.out.println(c);
//     }catch(java.lang.Exception e){
//         System.out.println("the Exception occurs" + e);
//     }
//   }  




public static void main(String [] args){
      int a, b ;
       try {
         a = Integer.parseInt(args[0]);
         b = Integer.parseInt(args[1]);
         if(b == 0){
            throw new ArithmeticException();
         }
         int ans = a /b;
         System.out.println(ans);
       }catch( java.lang.Exception e){
        System.out.println(e);
       }
  }



}
