package WeekendProject;

/**
 *
 * @author Liz Richards
 */
public class Operations {

    /**
     *
     * @param p the interface used to create the lambda expressions
     * @param num the number to be checked
     * @return
     */
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    /**
     *
     * @return if a is an odd number or not
     */
    public static PerformOperation isOdd() {
        return a -> (a % 2 != 0);
    }

    /**
     *
     * @return if a is a prime number or not
     */
    public static PerformOperation isPrime() {
        return a -> {
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    /**
     *
     * @return if a is a palindrome or not
     */
    public static PerformOperation isPalindrome() {
        return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
    }
}
