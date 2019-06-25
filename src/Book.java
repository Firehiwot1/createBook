public class Book {

    private String booktitle;
    private String auther;
    private String discreption;
   private boolean isInStock;
   // private double price;

    public Book() {

    }

    public Book(String auther, String booktitle, String discreption) {
        this.auther = auther;
        this.booktitle = booktitle;
        this.discreption = discreption;
        //this.isInStock = isInStock;
        //this.price = price;
    }

    public String getauther() {
        return auther;
    }

    public void setauther(String auther) {
        this.auther = auther;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }


    public String getdiscreption() {
        return discreption;
    }

    public void setdiscreption(String discreption) {
        this.discreption = discreption;
    }
}

//    public String getisInStock() {
//        return isInStock;
//    }
//
//    public void setisInStock(String isInStock) {
//        this.isInStock = isInStock;
//    }
//
//    public double getprice() {
//        return price;
//    }
//
//        public void setprice (double price){
//            this.price = price;
//        }
//    }
//
//






