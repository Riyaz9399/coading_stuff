public class Product {

    // Constructor 
    Product( int productCode){
       System.out.println(productCode);
    }
    // Methods
     void productName(String productName){
        System.out.println(productName);
    }
    public static void main(String [] args){
        String  productName = "Groceries";
        String manufactureName = "Industries";
        int  productCode = 1223;
        // Define an Onject of the product Class 
        Product myobj = new Product(productCode);
        myobj.productName(productName);
        System.out.println(manufactureName);


    }
}


 class TestProduct{
    public static void main(String [] args){
        Product myProduct = new Product(1234);
        myProduct.productName("SAKSHI");
    }
}