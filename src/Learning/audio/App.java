package Learning.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        File file = new File("src/Learning/audio/cash-register-fx_A_minor.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            String response = "";

            while (!response.equals("Q")) {
                System.out.println("P = play, S = stop, R = reset, Q= quit");
                response = scanner.next();
                response = response.toUpperCase();
                switch (response) {
                    case ("P") -> clip.start();
                    case ("S") -> clip.stop();
                    case ("R") -> {
                        clip.setMicrosecondPosition(0);
                        clip.start();
                    }
                    case ("Q") -> {
                        clip.close();
                        System.out.println("END");
                    }
                    default -> System.out.println("Not a valid response");
                }
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}