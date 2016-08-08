import javax.swing.*;

/**
 * Created by james on 8/08/2016.
 * calculates price of eggs by dozen and individual
 */
import java.util.Scanner;

public class Eggs {
    final static double DOZEN_PRICE = 3.25;
    final static double SINGLE_PRICE = 0.45;
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(null, "Enter number of eggs");
//        Scanner inputDevice = new Scanner(System.in);
        int eggs = Integer.parseInt(userInput);
        int wholeDozens = eggs /12;
        int eggsRemainder;
        double singleCost;
        double dozenCost = wholeDozens * DOZEN_PRICE;
        //Just playing with loops, I know its not necessary
        if ((eggs % 12) == 0);{
            eggsRemainder = eggs % 12;
            singleCost = eggsRemainder * SINGLE_PRICE;
        }
//        System.out.println(eggsRemainder);
        System.out.println("Eggs: " + eggs +"\nWhole: " + wholeDozens + "($" + dozenCost + ")"+ " Single: " +eggsRemainder
                + "($" + singleCost +  ")\nTotal cost: $" +  (singleCost + dozenCost));

    }
}
