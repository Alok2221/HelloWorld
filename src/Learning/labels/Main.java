package Learning.labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //  JLabel =    a GUI display area for a string of text, an image, or both

        ImageIcon icon = new ImageIcon("src/Learning/labels/picture.png");
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 3);


        JLabel label = new JLabel("Fam, do you even code properly?");   //  create a label + setting label's text
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); //  set text LEFT, CENTER, RIGHT of image
        label.setVerticalTextPosition(JLabel.TOP);  //  set text TOP, CENTER, BOTTOM of image
        label.setForeground(Color.YELLOW);    //  set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //  set font of text
        label.setIconTextGap(0);    //  set gap of text to image
        label.setBackground(Color.BLACK);   //  set background color
        label.setOpaque(true);  //  display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);  //  set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);    //   set horizontal position of icon+text within label
//        label.setBounds(100,100,350,350 );

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}