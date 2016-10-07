package Workshop_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by james on 5/10/2016.
 */
public class JFrameDisableButton extends JFrame implements ActionListener{
    JButton myButton;
    int buttonPressCount = 0;

    public JFrameDisableButton(){
        super("JFrame button demo");
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        myButton = new JButton("Submit!");
        myButton.addActionListener(this);
        this.add(myButton);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++buttonPressCount;
        if(buttonPressCount>7){
            myButton.setEnabled(false);
            this.add(new JLabel("That's enough"));
            validate();
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton myDemo = new JFrameDisableButton();
    }
}
