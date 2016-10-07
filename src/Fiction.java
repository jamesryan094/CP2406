/**
 * Created by james on 12/09/2016.
 */
public class Fiction extends Book{

    public Fiction(String title){
        super(title);
        setPrice();
    }

    public void setPrice(){
        price = 24.99;
    }

    public String toString(){
        return (super.toString() + "\nFiction");
    }
}
