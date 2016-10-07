import java.util.Scanner;

/**
 * Created by james on 12/09/2016.
 */
public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Scanner keys = new Scanner(System.in);
        String tempTitle;
        String tempGenre;
        for(int i = 0; i < library.length; ++i){
            System.out.println("Enter title of book: ");
            tempTitle = keys.nextLine();
            System.out.println("(F)iction or (N)onFiciton?");
            tempGenre = keys.nextLine();
            if(tempGenre.equalsIgnoreCase("F")){
                library[i] = new Fiction(tempTitle);
            }
            else{
                library[i] = new NonFiction(tempTitle);
            }
        }
        for(int i = 0; i < library.length; ++i){
            System.out.println(library[i].toString());
        }
    }
}
