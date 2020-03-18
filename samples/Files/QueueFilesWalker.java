package Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Walk directory with queue
 */
public class QueueFilesWalker {
    public static List<String> getFileTree(String dir) throws IOException {
        List<String> files = new ArrayList<>();

        Queue<File> queue = new LinkedList<>();
        queue.add(new File(dir));

        while (!queue.isEmpty()) {
            File next = queue.poll();

            for (File f: next.listFiles()) {
                if (f.isDirectory()) {
                    queue.add(f);
                } else {
                    files.add(f.getAbsolutePath());
                }
            }
        }

        return files;
    }

    public static void main(String[] args) throws IOException {
        getFileTree("somedir");
    }
}
