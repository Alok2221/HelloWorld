package Learning.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        //  exception = an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a whole number to divide");
            int i = scanner.nextInt();

            System.out.println("Enter a whole number to divide");
            int j = scanner.nextInt();

            int z = i / j;
            System.out.println("result is: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0!!! IDIOT!");
        } catch (InputMismatchException e) {
            System.out.println("Pleas enter a number OMG!!!");
        } finally {
            System.out.println("That's it");
        }
    }
}