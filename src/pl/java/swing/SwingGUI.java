package pl.java.swing;
import javax.swing.*;
public class SwingGUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");

        String age;
        boolean isNotDigit = false;
        do {
            age = (JOptionPane.showInputDialog("Enter your age: "));
            for (char c : age.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(null, "You are stupid!");
                    isNotDigit = true;
                    break;
                }
            }
        } while (isNotDigit);
        JOptionPane.showMessageDialog(null, "Your age is: " + age);


    }


}


