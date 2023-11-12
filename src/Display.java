public class Display {
    public static void displayTitle() {
        System.out.println("  ______________________________________");
        System.out.println(" |\t                         \t|");
        System.out.println(" |\tGrade Verification System\t|");
        System.out.println(" |______________________________________|");
    }
    
    public static void display(float examScore, float rating, float quizAvg, float recitation, float classStanding, float classAverage, float lectureGrade, float projectGrade, float labGrade, float prelimGrade, String username) {
        System.out.printf(" %s, your grade for this period are:\n", username);
        System.out.printf(" Exam score: %.2f\n", examScore);
        System.out.printf(" Exam Rating: %.2f\n", rating);
        System.out.printf(" Quiz Average: %.2f\n", quizAvg);
        System.out.printf(" Recitation: %.2f\n", recitation);
        System.out.printf(" Class Standing: %.2f\n", classStanding);
        System.out.printf(" Class Average: %.2f\n", classAverage);
        System.out.printf(" Lecture Grade: %.2f\n", lectureGrade);
        System.out.printf(" Project Grade: %.2f\n", projectGrade);
        System.out.printf(" Laboratory Grade: %.2f\n", labGrade);
        System.out.printf(" Prelim Grade: %.2f\n", prelimGrade);
    }

    public static void display(float examScore, float rating, float quizAvg, float recitation, float projectGrade, float classStanding, float prelimGrade, String username) {
        System.out.printf(" %s, your grade for this period are:\n", username);
        System.out.printf(" Exam Score: %.2f\n", examScore);
        System.out.printf(" Exam Rating: %.2f\n", rating);
        System.out.printf(" Quiz Average: %.2f\n", quizAvg);
        System.out.printf(" Recitation: %.2f\n", recitation);
        System.out.printf(" Project Grade: %.2f\n", projectGrade);
        System.out.printf(" Class Standing: %.2f\n", classStanding);
        System.out.printf(" Prelim Grade: %.2f\n", prelimGrade);
    }

    public static void displayThankYouMessage() {

        String message = "Thank you for using our program!";
        String string = "|    " + message + "    |";
        String blankSpace = "";
        String underscores = "";

        for (int i = 1; i <= string.length() - 2; i++) {
            blankSpace += " ";
        }

        for (int i = 1; i <= string.length() - 2; i++) {
            underscores += "_";
        }


        System.out.println("  " + underscores);
        System.out.println(" |" + blankSpace + "|");
        System.out.println(" |    " + message + "    |");
        System.out.println(" |" + underscores + "|");
    }
}