package Workshop_3;

/**
 * Created by james on 15/08/2016.
 * Takes number from user, performs arithmetic
 */
import java.util.Scanner;
public class NumbersDemo {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        int num = keys.nextInt();
        displayNumTwice(num);
        displayNumPlusFive(num);
        displayNumSquared(num);
    }

    public static void displayNumTwice(int num){
        System.out.println(num + "," + num);
    }

    public static void displayNumPlusFive(int num){
        System.out.println(num+5);
    }

    public static void displayNumSquared(int num){
        System.out.println(Math.pow(num,num));
    }

}
