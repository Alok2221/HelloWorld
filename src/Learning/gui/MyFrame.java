package Learning.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("JAVA IS THE BEST");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("src/Learning/gui/photo.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0, 255, 255));
    }
}