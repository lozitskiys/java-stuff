package Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Walk directory recursively.
 */
public class RecursiveFilesWalker {

    public static void doRecursive(File fileOrDir, ArrayList<File> files) {
        if (fileOrDir.isDirectory()) {
            for (File file : fileOrDir.listFiles()) {
                doRecursive(file, files);
            }
        } else {
            files.add(fileOrDir);
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<File> files = new ArrayList<>();

        var dir = new File("somedir");
        doRecursive(dir, files);
    }
}
