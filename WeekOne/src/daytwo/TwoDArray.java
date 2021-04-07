package daytwo;

import java.util.Random;

/**
 *
 * @author Liz Richards
 */
public class TwoDArray {

    final static int ROWS = 5;
    final static int COLUMNS = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = new int[ROWS][COLUMNS];
        Random gen = new Random();
        int max = -5;
        int row = -1;
        int column = -1;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                arr[i][j] = gen.nextInt(999) + 1;
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("The largest number generated was: " + max);
        System.out.println("It is located in row " + row + " and column " + column + " of the array.");
        System.out.println("(Please note that row and column numbers start with 0)");
        System.out.println("The numbers generated were:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

}
