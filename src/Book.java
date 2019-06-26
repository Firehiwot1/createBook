public class Book {


    private String bookTitle;
    private String auther;

    private String discreption;
    private boolean isInStock;
    private double price;

    public Book() {

    }

    public Book(String auther, String bookTitle, String discreption, boolean isInStock, double price) {
        this.auther = auther;
        this.bookTitle = bookTitle;
        this.discreption = discreption;
        this.isInStock = isInStock;
        this.price = price;
    }

    public String getAuther() {
        return this.auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getBookTitle() {
        return bookTitle;

    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }


    public String getDiscreption() {
        return discreption;
    }

    public void setDiscreption(String discreption) {
        this.discreption = discreption;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public void getDisplayText(){
        System.out.println(auther +" "+bookTitle+" "+ discreption);
    }
    public String getTotalPrice( double noBooks) {
        if (isInStock == true) {
            return (noBooks * price)+"";

        }
        return "not in stock";
    }

}

