import java.util.*;

import javax.swing.text.html.HTMLDocument.BlockElement;

class Book{
    int book_id;
    String title , author , publisher;
    int quantity;
    public Book(int book_id , String title , String author , String publisher ,int quantity){
       this.book_id = book_id;
       this.title = title;
       this.author = author;
       this.publisher = publisher;
       this.quantity = quantity;
    }

    public String toString(){
        return " Book Id :"  + book_id + ", Auther : " +author + ", title : " + title + ", Publisher : " + publisher + ", Quantity : " + quantity;
    }

    public boolean equals(Object o){
        return (this.book_id == ((Book) o).book_id );
    }
    public int hascode(){
        return book_id;
    }
}

public class Setclass {

    public static void main(String args [] ){
        LinkedHashSet <Book> liberary  = new LinkedHashSet<Book>();
        Book b1 = new Book(101, "lets as C", "rupal Shah", "Sakshi kushwaha", 10);
        Book b2 = new Book(102, "JAva ", "Anurag Tiwari", "Shivlaal", 4);
        Book b3 = new Book(103, "Pyhon", "Sakhsi kushwaha", "Ungrade", 5);
        Book b4 = new Book(104, "Concepts Of OOPS", "Prevein jain","OXford University", 6);

        liberary.add(b1);
        liberary.add(b2);
        liberary.add(b3);
        liberary.add(b4);
        // System.out.println(liberary);

        for(Book b : liberary){
            System.out.println(b);
        }

        Book b5 = new Book(104, "Concepts Of OOPS", "Prevein jain","OXford University", 6);

        liberary.add(b5);
        liberary.add(b3);

        Iterator<Book> iter = liberary.iterator();
        System.out.println();
        System.out.println("Traverising from Iterator ");
        while(iter.hasNext()){
            Book b = (Book) iter.next();
            System.out.println(b);
        }
        LinkedHashSet<Integer> integer = new LinkedHashSet<Integer>();

        integer.add(10);
        integer.add(20);
        integer.add(30);
        integer.add(30);
        System.out.println(integer);

    }
}
