/**
 * Created by james on 8/08/2016.
 * Get number from user representing nautical miles
 * Convert user input to KM and Miles
 * Display results in string
 */
import javax.swing.*;
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double MILES_TO_NAUTICAL = 0.868976;
        final double KM_TO_NAUTICAL = 0.539957;
        String userString = JOptionPane.showInputDialog(null, "enter a positive integer to be converted >>>");
        double userNum = Double.parseDouble(userString);
        System.out.println("Nautical Miles: " + userNum + "\nKilometres: " + (userNum * KM_TO_NAUTICAL) + "\nMiles :" + (userNum * MILES_TO_NAUTICAL));
    }
}
