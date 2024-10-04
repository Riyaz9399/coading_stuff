public class ExceptionHandling {
    public static void main(String args[]){
        
        try{
            int a = Integer.parseInt(args[0]);
             int b = Integer.parseInt(args[1]);
            int sum = a + b;
            int mult = a * b;
            int div = a / b;
            int mod = a % b ;
            System.out.println("Sum = :" + sum + " Multipliction : " + mult + " Division :" + div + " Modiules : " + mod);

        }catch(ArrayIndexOutOfBoundsException arr){
            System.out.println("Please enter the two number of a and b for arithematic operation!");
        }
        catch(NumberFormatException num){
            System.out.println("Please enter only number ");
        }
        catch(ArithmeticException ar){
            System.out.println("your given number are invalid !");
        }



    }
}
