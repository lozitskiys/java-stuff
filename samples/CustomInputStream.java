import java.io.*;

/**
 * Custom input stream demo.
 *
 * Useful in debugging (no need to type in console by hands).
 */
public class CustomInputStream {
    public static void main(String[] args) throws IOException
    {
        String inp = "My\nname\nis\nStanislav\n";

        InputStream is = new ByteArrayInputStream(inp.getBytes());

        System.setIn(is);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
