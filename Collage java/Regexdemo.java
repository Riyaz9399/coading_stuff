import java.util.regex.*;


public class Regexdemo {
    public static void main(String [] args){
        Pattern pattern = Pattern.compile("L[a-z]*n");
        Matcher match = pattern.matcher("Learnvern");
        boolean isMatched = match.matches();

        if(isMatched){
            System.out.println("The String is matches to your Given Pattern");
        }else{
            System.out.println("The String is Not Matches to your Given Pattern");
        }

    }
}
