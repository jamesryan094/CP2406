import javax.swing.*;

/**
 * Created by james on 8/08/2016.
 */
public class QuartstoGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        String gallonsNeededstring = JOptionPane.showInputDialog(null, "Enter number of gallons required");
        int gallonsNeeded = Integer.parseInt(gallonsNeededstring);
        System.out.println(gallonsNeeded + " gallons requires " + (QUARTS_IN_GALLON*gallonsNeeded) + " quarts.");
    }
}
