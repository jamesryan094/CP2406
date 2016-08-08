import javax.swing.*;
import java.util.Scanner;

/**
 * Created by james on 8/08/2016.
 * Takes initials from user input
 * displays in string, seperated by periods
 */
public class Initials {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter initials");
        String initials = inputDevice.next();
        char first = initials.charAt(0);
        char second = initials.charAt(1);
        char third = initials.charAt(2);
        System.out.println(first + "." + second + '.' + third);
    }
}
