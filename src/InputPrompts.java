import java.util.Scanner;
import java.util.InputMismatchException;

public class InputPrompts {
    public static String getUserName(Scanner console) {
        String name = "";

        do {
            System.out.print(" Enter your name: ");
            name = console.nextLine();

            if (name.length() == 0) {
                System.out.print(" ");
                Format.separation();
                Format.generateNewLine();
                Format.generateNewLine();
            }
        } while (name.length() == 0);

        return name;
    }

    public static String quitPrompt(Scanner console) {
        System.out.println(" Do you want to quit? If so, type yes. If not, press Enter or type anything.");
        System.out.print(" Response: ");

        console.nextLine();

        return console.nextLine();
    }

    public static int chooseSubject(Scanner console) {
        boolean error = false;
        int choice = 0;

        do {
            error = false;
            try {
                System.out.println();
                System.out.println(" Please select a subject.");
                System.out.println(" 1 for Laboratory Subject");
                System.out.println(" 2 for Non-Laboratory Subject.");
                Format.generateNewLine();
                System.out.print(" Choice: ");
                choice = console.nextInt();
            } catch (InputMismatchException e) {
                System.out.print(" ");
                Format.separation();
                Format.generateNewLine();
                Format.generateNewLine();

                System.out.println(" Please enter a number.");

                System.out.print(" ");
                Format.separation();
                Format.generateNewLine();

                error = true;
                console.nextLine();
            }
        } while (error);

        return choice;
    }

    public static float getExamScore(Scanner console) {
        float grade = 0;
        boolean error = false;

        do {
            error = false;

            try {
                System.out.print(" What is your exam score? ");
                grade = console.nextFloat();
            } catch (InputMismatchException e) {
                Error.errorMessage();

                error = true;
                console.nextLine();
            }
        } while (error);

        return grade;
    }

    public static int getItems(Scanner console) {
        boolean error = false;
        int items = 0;

        do {
            error = false;

            try {
                System.out.print(" How many items is the exam? ");
                items = console.nextInt();
            } catch (InputMismatchException e) {
                Error.errorMessage();

                error = true;
                console.nextLine();
            }
        } while (error);

        return items;

    }

    public static float getQuizScore(Scanner console, int quizNumber) {
        float grade = 0;
        boolean error = false;

        do {
            error = false;

            try {
                System.out.printf(" What is your score for Quiz #%d? ", quizNumber);
                grade = console.nextFloat();
            } catch (InputMismatchException e) {
                Error.errorMessage();

                error = true;
                console.nextLine();
            }
        } while (error);

        return grade;
    }

    public static float getRecitation(Scanner console) {
        boolean error = false;
        float grade = 0;

        do {
            error = false;

            try {
                System.out.print(" Enter your grade in recitation: ");
                grade = console.nextFloat();
            } catch (InputMismatchException e) {
                Error.errorMessage();

                error = true;
                console.nextLine();
            }
        } while (error);

        return grade;
    }

    public static float getProjectGradeInput(Scanner console) {
        float grade = 0;
        boolean error = false;

        do {
            error = false;
            try {
                System.out.print(" What is your project grade? ");
                grade = console.nextFloat();
            } catch (InputMismatchException e) {
                Error.errorMessage();
                
                error = true;
                console.nextLine();
            }
        } while (error);

        return grade;
    }
}