package mypack;

public class Demo{
    // private int pri_i ;
    int def_i;
    protected int pro_i;
    public int pub_i;

    public void set(){
        // pri_i = 10;
        def_i = 20;
        pro_i = 30;
        pub_i = 40;
    }

}


 class SamepackDerived extends Demo{
    public void set(){
        pro_i = 10;
        def_i = 20;
        pro_i = 30;
        pub_i = 40;
    }
}

 

