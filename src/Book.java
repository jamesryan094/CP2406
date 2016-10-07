/**
 * Created by james on 12/09/2016.
 */
public abstract class Book {
    protected String title;
    protected Double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return ("Title: " + title + "\nPrice: $" + price);
    }

    public abstract void setPrice();
}
