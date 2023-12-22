public class Main {
    public static void main(String[] args) {

        String path = ConsoleReader.consoleReader();
        String reader = DocReader.docReader(path);
        DocWriter.docWriter(reader);
    }
}