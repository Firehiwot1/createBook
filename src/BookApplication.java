import java.util.Scanner;


public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book();
//         Type: Book
//         Object name: book1

        book1.setBookTitle("Java");
        book1.setAuther("Fre");
        book1.setDiscreption("java for biggners");
        book1.setInStock(true);
        book1.setPrice(10);
        book1.getDisplayText();
        System.out.println(book1.getTotalPrice(10));

        //Overloaded constructor

        Book book2 = new Book("Firehiwot", "Programming", " programming for bigginers", true, 20);

        book2.getDisplayText();
        System.out.println(book2.getTotalPrice(10));

        String booktitle = book1.getBookTitle();
        String auther = book1.getAuther();
        String discreption = book1.getDiscreption();
        boolean isInStock = book1.isInStock();
        double price = book1.getPrice();


        System.out.println(auther);
        System.out.println(booktitle);
        System.out.println(discreption);
        System.out.println(isInStock);
        System.out.println(price);


    }
}