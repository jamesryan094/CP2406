package Workshop_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by james on 5/10/2016.
 */
public class JBookQuote extends JFrame implements ActionListener{

    String title;
    String quote;
    JLabel myLabel;
    JLabel myTitleLabel;
    JButton myButt;

    public JBookQuote(String title, String quote){
        super("Book Quotes");
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.title = title;
        this.quote = quote;
        myLabel = new JLabel(quote);
        this.add(myLabel);

        myTitleLabel = new JLabel("");
        this.add(myTitleLabel);

        myButt = new JButton("Submit");
        myButt.addActionListener(this);
        this.add(myButt);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        JBookQuote myBookQuote = new JBookQuote("Tale Two Cities", "It was the best of times, it was the worst of times");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myTitleLabel.setText(title);
        validate();
        repaint();
    }
}
