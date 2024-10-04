
public class Trycatch {
    public static void main(String [] args){
        try{
            int a ;
            int b ;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            if((a == 0) || (b == 0) ){
                throw new ArithmeticException();
            }
            if((a <= 0) || (b <= 0)){
                throw new java.lang.Exception();
            }
            System.out.println("thanks for using this class");
        }
        catch(ArrayIndexOutOfBoundsException aibo){
                System.out.println("The exception out of bound Please provide a Value of A and b  ");
               
        }
        catch(NumberFormatException en){
            System.out.println("provide integer Number only");
        }

        catch(ArithmeticException e){
            System.out.println("either of the valuse are zero ");
            // System.exit(1);
            // return;
        }
        catch(java.lang.Exception e){
            System.out.println("The exception is occure and that is : " + e);
        }
        finally{
            System.out.println("Thanks for using our class From finallu 1");
        }
        // finally{
        //     System.out.println("THanks for using a finally 2 class ");
        // }
        System.out.println("The line After the finally block");
       
    }  
        
 }



