package daytwo;

/**
 *
 * @author Liz Richards
 */
public class CommandLineAdding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int added = 0;
        for (String s : args) {
            try {

                added += (Integer.parseInt(s));
            } catch (Exception e) {
                System.out.println(s + " is not a number, omitting it.");
            }

        }
        System.out.println("The sum of all numbers entered in the command arguments is: " + added);
    }

}
