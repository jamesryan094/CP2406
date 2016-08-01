/**
 * Take user input, display input formatted
 * Created by james on 1/08/2016.
 */
import java.util.Scanner;

public class MovieQuoteInfo {
    public static void main(String[] args){

        //variable declarations
        Scanner inputDevice = new Scanner(System.in);
        String movie;
        int year;
        String quote;
        String character;

        //prompting & retreving usier input
        System.out.println("What is your favourite movie? >>>");
        movie = inputDevice.nextLine();
        System.out.println("What year? >>>");
        year = inputDevice.nextInt();
        inputDevice.nextLine(); //next line to clear empty character from cache
        System.out.println("What is your favourite quote from " + movie + " >>>");
        quote = inputDevice.nextLine();
        System.out.println("What character said this? >>>");
        character = inputDevice.nextLine();
        System.out.println("Movie: " + movie);
        System.out.println("Year: "+ year);
        System.out.println("Quote:" + quote);
        System.out.println("Character: " + character);

    }
}
