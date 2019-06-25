import java.util.Scanner;

public class BookApplication {
    public static void main(String [] args){
       Book book1 = new Book();
//         Type: Book
//         Object name: book1

          book1.setBooktitle("Java");
          book1.setauther("Fre");
          book1.setdiscreption("java for biggners");
          //book1.setisInStock("Yes");
           //book1.setprice(10);

         //Overloaded constructor
        Book getDisplayText  = new Book("Firehiwot","Programming"," programming for bigginers");


        System.out.println(getDisplayText.getauther() + " , " + getDisplayText.getBooktitle() + ", " + getDisplayText.getdiscreption()  );
        //Create a class called BookApp which contains the main method and create an instance of a Book and print the Author, Title and Description.

        String booktitle= book1.getBooktitle();
        String auther = book1.getauther();
        String discreption= book1.getdiscreption();
        //String isInStock = book1.getisInStock();
       // double price = book1.getprice();



        System.out.println(auther);
        System.out.println(booktitle);
        System.out.println(discreption);
        //System.out.println(isInStock);
       // System.out.println(price);




    }
}



