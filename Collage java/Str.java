
public class Str {
    public static void main(String args[]){
        char ch[] = {'j','a','v','a'};
        System.out.println(ch); // java
        String ch1 = "sakshi";
        System.out.println(ch1.length()); // ch length 
        String str = new String(ch); // convert ch to string 
        System.out.println("Original string : "+str);
        System.out.println("Str length :" + str.length());
        System.out.println("Str UpperCase : " + str.toUpperCase());
        System.out.println("Str LowerCase : " + str.toLowerCase());
    }    
}
