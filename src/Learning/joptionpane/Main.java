package Learning.joptionpane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOption Pane =   pop up a standard dialog box that prompts users for a value
        //                  or informs them of something

//        JOptionPane.showMessageDialog(null, "This is some useless note", "Message", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "More of useless txt", "Information", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "For real?", "Question", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Stop it!!", "Warning", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Something went wrong!", "Error", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showConfirmDialog(null, "do you even code?", "This is my title", JOptionPane.YES_NO_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name?: ");

        String[] response = {"No, you're awesome!", "thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("src/Learning/panels/foto.jpg");

        JOptionPane.showOptionDialog(
                null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                response,
                0);
    }
}