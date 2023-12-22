import java.io.FileWriter;
import java.io.IOException;

public class DocWriter {

    public static void docWriter(String line){
        try {
            FileWriter writer;
            if ((line.length() == 15) && (line.startsWith("docnum") || line.startsWith("contract"))) {
                writer = new FileWriter("Valid report.txt");
                writer.write("Valid document \n" + DocReader.docReader(line));
            } else {
                writer = new FileWriter("Valid report.txt");
                writer.write("Non valid document \n" + DocReader.docReader(line));
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }
    }
}
