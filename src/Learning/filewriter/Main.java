package Learning.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("src/Learning/filewriter/poem.txt");
            fileWriter.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRocking everywhere!");
            fileWriter.append("\n(A poem by Bro)");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}