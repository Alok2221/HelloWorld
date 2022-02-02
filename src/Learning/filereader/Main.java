package Learning.filereader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //  FileReader =    read the content of a file as a stream of characters. One by one
        //                  read() returns an int value which contains the byte value
        //                  when read() returns -1, there is no more data to be read.

        try {
            FileReader reader = new FileReader("src/Learning/filereader/art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}