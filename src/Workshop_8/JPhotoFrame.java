package Workshop_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by james on 19/09/2016.
 * 1 subject = 40
 * >=2 subjects = 75
 * pet = 95
 * studio + 0, location + 90
 */
public class JPhotoFrame extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel subjectLabel = new JLabel("Subject(s): ");
    JComboBox<String> subjectBox = new JComboBox<>();
    JLabel locationLabel = new JLabel("Location: ");
    JComboBox<String> locationBox = new JComboBox<>();

    int[] subjectPrices = {40, 75, 95};
    int[] locationPrices = {0, 90};
    int subjectPrice = 0;
    int locationPrice = 0;

    int total = 0;
    int subjectIndex;
    int locationIndex;
    JLabel totalLabel = new JLabel();


    public JPhotoFrame() {
        super("Photo Prices");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        add(subjectLabel);
        subjectBox.addItemListener(this);
        subjectBox.addItem("One subject");
        subjectBox.addItem("Two or more subjects");
        subjectBox.addItem("Animal subject");
        add(subjectBox);

        add(locationLabel);
        locationBox.addItemListener(this);
        locationBox.addItem("Studio");
        locationBox.addItem("Location");
        add(locationBox);

        add(totalLabel);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();

        if (source.equals(subjectBox)) {
            subjectIndex = subjectBox.getSelectedIndex();
            subjectPrice = subjectPrices[subjectIndex];
        } else {
            locationIndex = locationBox.getSelectedIndex();
            locationPrice = locationPrices[locationIndex];
        }
        total = locationPrice + subjectPrice;
        totalLabel.setText("Total: " + total);
    }

    public static void main(String[] args) {
        JFrame frame = new JPhotoFrame();
        frame.setSize(200, 150);
        frame.setVisible(true);
    }
}