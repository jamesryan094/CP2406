/**
 * Created by james on 12/09/2016.
 */
public class NonFiction extends Book {

    public NonFiction(String title){
        super(title);
        setPrice();
    }

    public void setPrice() {
        price = 37.99;
    }

    public String toString(){
        return (super.toString() + "\nNon Fiction");
    }
}
