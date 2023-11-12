import java.util.Scanner;
import java.util.InputMismatchException;

public class PrelimProject {    
    public static void main(String[] args) {
         
        Scanner console = new Scanner(System.in);
        Student student = new Student();
        String quit = "";
        float[] quizScores = new float[5];

        do {
            
            Display.displayTitle();
            Format.generateNewLine();

            student.setName(InputPrompts.getUserName(console));

            Format.space();

            
            int choice = InputPrompts.chooseSubject(console);
            Format.space();

            if (choice == 1 || choice == 2) {
                
                Format.generateNewLine();

                student.setExamScore(InputPrompts.getExamScore(console));
                int examItems = InputPrompts.getItems(console);
                student.setExamRating(examItems);

                Format.space("This one adds an extra new line.");

                for (int i = 0; i < quizScores.length; i++) {
                    quizScores[i] = InputPrompts.getQuizScore(console, i + 1);
                }

                student.setQuizAvg(quizScores);
                Format.space("This one adds an extra new line.");

                student.setRecitationGrade(InputPrompts.getRecitation(console));
                Format.space("This one adds an extra new line.");

                student.setProjectGrade(InputPrompts.getProjectGradeInput(console));
                Format.space("This one adds an extra new line.");

                if (choice == 1) {
                    
                    student.setClassStanding("lab");
                    student.setClassAverage();
                    student.setLectureGrade();
                    student.setLabGrade();
                    student.setPrelimGrade("lab");
                    student.toString("lab");

                    Format.space("This one adds an extra new line.");

                } else if (choice == 2) {
                    
                    student.setClassStanding("non lab");
                    student.setPrelimGrade("non lab");
                    student.toString("non lab");

                    Format.space("This one adds an extra new line.");  
                    
                }

                quit = InputPrompts.quitPrompt(console);

            } else {
                Error.invalidChoice(console);
            }

        } while (!quit.equals("yes"));

        Display.displayThankYouMessage();
        Format.generateNewLine();
    }

}
