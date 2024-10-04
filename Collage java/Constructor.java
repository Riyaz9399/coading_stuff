public class Constructor {
    int a ; 
    int b ;
    public Constructor(int a , int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "a : " + a +  "  b : " + b;
    }

    public static void main(String [] args){
        Constructor obj = new Constructor(1,10);
        System.out.println(obj);
    }
}


