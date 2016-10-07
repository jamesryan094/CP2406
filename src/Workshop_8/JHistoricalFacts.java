package Workshop_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by james on 5/10/2016.
 */
public class JHistoricalFacts extends JFrame implements ActionListener{
//    JLabel fact1 = new;
//    JLabel fact2;
//    JLabel fact3;
//    JLabel fact4;
//    JLabel fact5;
//    JLabel fact6;
    JLabel fact1 = new JLabel("Australia is old");
    JLabel fact2 = new JLabel("Europe is probably the same age");
    JLabel fact3 = new JLabel("but people have done interesting things there for longer");
    JLabel fact4 = new JLabel("the 1800s probably sucked");
    JLabel fact5 = new JLabel("The first automobile was made in 1978");
    JLabel fact6 = new JLabel("no more facts");
    JButton myButton;


    JLabel[] facts = {fact1, fact2, fact3, fact4, fact5, fact6};

    int count = 0;

    public JHistoricalFacts(){
        super("Historical Facts JFrame Demo");
        this.setLayout(new FlowLayout());
        this.setSize(500,200);
        myButton = new JButton("Click here, its important!");
        myButton.addActionListener(this);
        this.add(myButton);
        this.add(facts[count]);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.remove(facts[count]);
        ++count;
        if (count==6){
            count = 0;
        }
        this.add(facts[count]);
        validate();
        repaint();
    }

    public static void main(String[] args) {
        JHistoricalFacts demo = new JHistoricalFacts();
    }
}
