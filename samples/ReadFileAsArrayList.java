import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Read file and put lines in ArrayList. In one line :)
 */
public class ReadFileAsArrayList {
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<String>();

        String fileName = "file.txt";

        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(lines);
    }
}
