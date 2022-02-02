package Learning.fileclass;

import java.io.File;

public class HowToFile {
    public static void main(String[] args) {

        //  file = An abstract representation of file and directory pathname

        File file = new File("src/Learning/fileclass/secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exists! :O");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
        } else {
            System.out.println("That file doesn't exist :(");
        }
    }
}