
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * FileReader vs FileInputStream and stuff.
 *
 * 1. Reads file name from stdin
 * 2. Reads file contents, using FileReader
 * 3. Sorts even numbers
 * 4. Prints them to stdout
 */
public class ReadFileBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));

        String fName = readerConsole.readLine();

        BufferedReader readerFile = new BufferedReader(new FileReader(fName));

        /**
         Or, more general case, because InputStreamReader supports different types of sources, not just files
         BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(fName)));
         **/

        List<Integer> list = new ArrayList<>();

        while (true) {
            String line = readerFile.readLine();
            if (null == line || line.isEmpty()) {
                break;
            }

            int num = Integer.parseInt(line);
            if (num % 2 == 0) {
                list.add(num);
            }
        }

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        readerConsole.close();
        readerFile.close();
    }
}
