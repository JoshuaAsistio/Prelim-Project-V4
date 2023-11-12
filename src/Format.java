public class Format {
    public static void generateNewLine() {
        System.out.println();
    }

    public static void printUnderscores() {
        System.out.print("_");
    }

    public static void separation() {
        for (int i = 1; i <= 40; i++) {
            printUnderscores();
        }
    }

    public static void space() {
        System.out.print(" ");
        Format.separation();
        Format.generateNewLine();
    }

    public static void space(String s) {
        System.out.print(" ");
        Format.separation();
        Format.generateNewLine();
        Format.generateNewLine();
    }
}