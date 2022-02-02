package Learning.gui;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {

        //  JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JAVA IS THE BEST");   //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application
        frame.setResizable(false);

        frame.setSize(420, 420); //sets the x-dimension, and y-dimension
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("src/Learning/gui/photo.jpg");  //create na ImageIcon
        frame.setIconImage(image.getImage());   //  change icon of frame
        frame.getContentPane().setBackground(new Color(0,255,255));  //  change color of background


    }
}