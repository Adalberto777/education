package seminar_two;

import jdk.dynalink.beans.StaticClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.*;

public class Main {

    static Logger logger = Logger.getLogger("seminar_two");
    public static void main(String[] args) {
//        System.out.println(buildString('x', 'o', 21));
//        System.out.println(archString("sssdfffgghhjjj"));
        printIntoFilesNames("D:\\NewGeekBrains\\Java\\Java_Project\\education\\src\\main\\java\\seminar_two");
    }

    private static void printIntoFilesNames(String path) {
        StringBuilder sb = new StringBuilder();
        logger.setLevel(Level.ALL);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);


        String[] names = convertPathToNameArr(path);

        if (names == null) {
            try {
                throw new RuntimeException("This directory is employ");
            }
            catch (RuntimeException e) {
                logger.severe(e.getMessage());
            }
            return;
        }

        for (String name : names) {
            sb.append(name).append(System.lineSeparator());
        }


        try (PrintWriter pw = new PrintWriter("src/main/resources/files/dir_files.txt")) {
            pw.println(sb.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            logger.severe("file is not found: " + e.getMessage());
        }
    }

    private static String[] convertPathToNameArr(String path) {
        File file = new File(path);
        return file.list();
    }

    private static String archString(String str) {
        if (str.trim().length() == 0) {
            return "";
        }
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        char curr = str.charAt(0);
        char prev = str.charAt(0);

        for (int i = 1; i < str.length() ; i++) {
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            if (curr != prev) {
                sb.append(prev);
                sb.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter ++;
        }
        if (counter != 0) {
            sb.append(curr);
            sb.append((counter > 1) ? counter : "");
            counter = 0;
        }

        return sb.toString();
    }

    private static String buildString(char c1, char c2, int lenght) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            if (i % 2 == 0) {
                sb = sb.append(c1);
            }else sb = sb.append(c2);
        }
        return sb.toString();
    }
}
