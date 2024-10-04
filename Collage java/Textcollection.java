import java.util.*;

class Book{
    String book_name ;
    String authorName;
    int book_ID ;

    public Book(int book_ID , String book_name , String authorName){
        this.book_name = book_name;
        this.authorName = authorName;
        this.book_ID = book_ID;
    }

    public String toString(){
        return "Book Name " + book_name + ", Book ID : " + book_ID + ", Author NAME : " + authorName;
    }

}


public class Textcollection {
    public static void main(String args[]){
        Set <Book> book = new HashSet<>();

       book.add(new Book(101, "let as C", "Jenkis"));
       book.add(new Book(102, "let as java", "Sakshi"));
       book.add(new Book(103, "let as puthon", "For AI "));
       book.isEmpty();


       Iterator <Book> iter = book.iterator();
        System.out.println("Showing result with the help of  iterator ..!");
       while (iter.hasNext()) {
        Book s  = (Book) iter.next();
        System.out.println(s);

        List <Book> bookList = new ArrayList<Book>();

        bookList.add(new Book(104, "let as C", "sakshi"));
        bookList.add(new Book(105, "let as C++", "Vini"));
        bookList.add(new Book(106, "let as Php", "For back end server "));
        bookList.isEmpty();

        Iterator <Book> Booklistiter = bookList.iterator();

        while (Booklistiter.hasNext()){
            Book a = (Book) iter.next();
            System.out.println(a);

        }

       }
    }
    
}
