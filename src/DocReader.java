import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocReader {

    public static String docReader(String path){
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
