package DayOne;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LizRichards
 */
public class GuessingGame {

    final static int MIN = 1;
    final static int MAX = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random gen = new Random();
        int num = gen.nextInt(MAX) + MIN;
        System.out.println("Guess a number between 1 and 100 (inclusive). You will have 5 tries.");
        int guess;
        boolean inRange = false;
        for (int i = 4; i >= 0; i--) {
            guess = validate();
            inRange = check(num, guess);
            if (inRange) {
                System.out.println("Congratulations! You guessed " + guess + " and the number was " + num + ".");
                break;
            } else if (i == 0) {
                System.out.println("Sorry, you have used all your guesses. The number was " + num + ".");
                break;
            }
            System.out.println("Sorry, try again. You have " + i + " guesses left. Please enter your next guess.");
        }
    }

    /**
     * Gets user input and recursively validates if it is within range.
     *
     * @return returns the user's guess
     */
    public static int validate() {
        Scanner col = new Scanner(System.in);
        int a;
        try {
            a = Integer.parseInt(col.nextLine());
        } catch (Exception NotValidInput) {
            System.out.println("Invalid entry please select a number between " + MIN + " and " + MAX + ".");
            a = validate();
        }
        if (a >= MIN && a <= MAX) {
            return a;
        } else {
            System.out.println("Invalid entry please select a number between " + MIN + " and " + MAX + ".");
            a = validate();
        }
        return a;
    }

    /**
     * Checks to see if the user's guess is within 10 of the secretly generated
     * number.
     *
     * @param secret the randomly generated number
     * @param guessed the number the player guessed
     * @return true or false if the guess is close enough to win
     */
    public static boolean check(int secret, int guessed) {
        return ((guessed - secret) <= 10 && (guessed - secret) >= -10);
    }
}
