package pl.java.swing;

import javax.swing.*;

public class SwingGUI {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        String inputAge = JOptionPane.showInputDialog("Enter your age");


        int age = Integer.parseInt("2");
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
    }
}
