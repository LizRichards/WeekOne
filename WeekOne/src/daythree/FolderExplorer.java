package daythree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liz Richards
 */
public class FolderExplorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the path to the directory you want a list of included files for.");
        Scanner in = new Scanner(System.in);
        String file = in.nextLine();
        Path directory = Paths.get(file);
        try {
            Files.walk(directory).forEach(path -> showFiles(path.toFile()));
        } catch (IOException ex) {
            Logger.getLogger(FolderExplorer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param file the file to get the path for
     */
    public static void showFiles(File file) {
        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getAbsolutePath());
        } else {
            System.out.println("File: " + file.getAbsolutePath());
        }
    }

}
