
import mypack.*;

public class AccessSpecifier2 extends Demo   {
     public void set(){
        // pri_i = 10;
        // def_i = 20;
        pro_i = 30;
        pub_i = 40;
     }
   

}

class StandAloneClass {
    public void set(){
        
            Demo obj = new Demo();
            // obj.pri_i = 20;
            // obj.def_i = 90;
            // obj.pro_i = 100;
            obj.pub_i = 100;

        
    }
}
