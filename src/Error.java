import java.util.Scanner;

public class Error {
    public static void errorMessage() {
        System.out.print(" ");
        Format.separation();
        Format.generateNewLine();
        Format.generateNewLine();

        System.out.println(" Error: Please enter a number.");

        System.out.print(" ");
        Format.separation();
        Format.generateNewLine();
        Format.generateNewLine();
    }

    public static void invalidChoice(Scanner console) {
        Format.generateNewLine();
        System.out.println(" Invalid Input. Please choose 1 for Laboratory Subjects and 2 for Non-Laboratory Subjects");
        console.nextLine();

        Format.generateNewLine();
    }
}