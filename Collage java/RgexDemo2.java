import java.util.regex.*;

import javax.annotation.processing.SupportedOptions;;

public class RgexDemo2 {
   public static void main(String [] args){
    Pattern p = Pattern.compile("LV");
   
    Matcher matcher = p.matcher("i said that LV Stands for Learnvern");
    if(matcher.lookingAt()){
        System.out.println("The PAttern is matches in Beginning");
    }else{
        System.out.println("The pattern is not found at Beiggning");
    }
    if(matcher.find()){
        System.out.println("The string is  find at the string ");
    }else{
        System.out.println("The string is not present at the string ");
    }
    if(matcher.find(9)){
        System.out.println("The lv is found at the range of the 9");
    }else {
        System.out.println("The lv is not present in the 9 range ");
    }
    if(matcher.matches()){
        System.out.println("The lv is here in the string ");
    }
    else{
        System.out.println("String is not follow the pattern");
    }


   } 
}
