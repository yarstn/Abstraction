public class Movie extends Product {
    private String director;



public void Movie(){

}
    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
        return "Movie{" +
                "director='" + director + '\'' +
                '}';
    }
}
