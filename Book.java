public class Book extends Product{
    private String author;
public void Book(){

}

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void getDiscount(){
        double dis= getPrice()*5/100;
if (getPrice() >= 15){
        System.out.println("you got a 5% the price after discount: "+getPrice()+dis);
    }else{
    System.out.println("sorry no discount..");
    }}

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + super.toString();
    }
}

