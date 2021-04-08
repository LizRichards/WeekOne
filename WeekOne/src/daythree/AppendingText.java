package daythree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Liz Richards
 */
public class AppendingText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text you want to add to the file.");
        String adding = input.nextLine();
        System.out.println("Adding " + adding + " to the file.");
        String file = "SeeMeGrow.txt";
        try (FileWriter append = new FileWriter(file, true)) {
            append.write(adding);
            System.out.println("text was added to the file");
        } catch (Exception e) {
            System.out.println("Oops, something went wrong!");
        }
    }

}
