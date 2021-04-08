package daythree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liz Richards
 */
public class CharacterCounter {

    private static final String FILE_PATH = "SomeRandomWords.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        Scanner scan;
        try {
            for (String s : args) {
                scan = new Scanner(new File(FILE_PATH));
                while (scan.hasNext()) {
                    String parseMe = scan.nextLine();
                    for (int i = 0; i < parseMe.length(); i++) {
                        if ((parseMe.charAt(i) == s.charAt(0))) {
                            count += 1;
                        }
                    }
                }
                System.out.println("There are " + count + " " + s + " characters in the file.");
                count = 0;
                scan.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot find file.");
        }

    }

}
