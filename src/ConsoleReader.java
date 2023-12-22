import java.util.Scanner;

public class ConsoleReader {

    public static String consoleReader(){
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        return path;
    }
}
