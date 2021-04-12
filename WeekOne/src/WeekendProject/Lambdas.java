package WeekendProject;

import java.io.*;
import java.util.*;

/**
 *
 * @author kusac
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of test cases you would like to run, followed by the tests, one per line.");
        System.out.println("1 tests odd/even, 2 tests if it is prime, 3 tests if it is a palindrome. Tests should be entered type first followed by the number to test");
        System.out.println("Ex: 2 33 would test if the number 33 is prime or not.");
        Operations ops = new Operations();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tests = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean back = false;
        String answer = null;
        while (Tests-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int test = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            //test for odd/even
            if (test == 1) {
                op = ops.isOdd();
                back = ops.checker(op, num);
                answer = (back) ? "Odd" : "Even";
                //check for prime
            } else if (test == 2) {
                op = ops.isPrime();
                back = ops.checker(op, num);
                answer = (back) ? "Prime" : "Not prime";
                //check if it is a palindrome
            } else if (test == 3) {
                op = ops.isPalindrome();
                back = ops.checker(op, num);
                answer = (back) ? "Palindrome" : "Not a palindrome";

            }
            System.out.println(answer);
        }
    }
}
