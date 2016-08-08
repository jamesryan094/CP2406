/**
 * Created by james on 8/08/2016.
 * Takes user input to represent inches
 * convert inches to feet and inches
 */
import javax.swing.*;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        String userString = JOptionPane.showInputDialog(null, "Enter number of Inches");
        int numInches = Integer.parseInt(userString);
        int wholeFeet = numInches/12;
        int inchesRemaining = numInches%12;
        JOptionPane.showMessageDialog(null, numInches + " corresponds to " + wholeFeet + " feet and " + inchesRemaining + " inches");
    }
}
