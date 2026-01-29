package SpringBoot.domain;

public class Book {

    private String title;
    private int price;

    public Book(){

    }

    public Book(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
