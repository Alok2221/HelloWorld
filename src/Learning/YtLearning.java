package Learning;

import java.util.Scanner;

public class YtLearning {
    public static void main(String[] args) {

        // logical operators = used two or more expressions

        //                      && = (AND) both conditions must be TRUE
        //                      || = (OR) either conditions must be TRUE
        //                      ! = (NOT) reverses boolean value of condition

        int temp = 15;      //&&
        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);
        // ||

        System.out.println("You are playing a game! Press q or Q to quit!");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game.");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }

        // !
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You still wants to play this game.");
        } else {
            System.out.println("You quited the game");
        }
    }
}




