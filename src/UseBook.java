/**
 * Created by james on 12/09/2016.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction myFiction = new Fiction("Lord of the Rings");
        NonFiction myNonFiction = new NonFiction("Java Programing Vol.2");
        System.out.println(myFiction.toString());
        System.out.println(myNonFiction.toString());
    }
}
