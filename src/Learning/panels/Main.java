package Learning.panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //  JPanel  =   a GUI component that functions as a container to hold other components

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        ImageIcon imageIcon = new ImageIcon("src/Learning/panels/foto.jpg");
        JLabel label = new JLabel("Hi");
        label.setIcon(imageIcon);
        label.setBounds(0, 0, 75, 75);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}