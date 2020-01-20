import java.io.*;

/**
 * Custom output stream demo.
 *
 * Modifying output.
 */
public class CustomOutputStream {
    public static void main(String[] args)
    {
        PrintStream origOutStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //make PrintStream adapter
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        System.out.println("upper case me plz");

        String result = outputStream.toString().toUpperCase();

        // back to orig stream
        System.setOut(origOutStream);

        System.out.println(result);
    }
}
