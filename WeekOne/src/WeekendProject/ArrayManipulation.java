package WeekendProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Liz Richards
 */
public class ArrayManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number of numbers in the array");
        //nums = new int[in.nextInt()];
        System.out.println("Enter the integers for the number list, divided by spaces");
        String input = in.nextLine();
        String[] tokens = input.split(" ");
        for (String s : tokens) {
            nums.add(Integer.parseInt(s));
        }
        System.out.println("You entered " + nums);
        List<String> words = new ArrayList<>();
        System.out.println("Enter the words or chaaracter groups for the string list, divided by spaces");
        String inputWords = in.nextLine();
        String[] tokens2 = inputWords.split(" ");
        for (String s : tokens2) {
            words.add(s);
        }
        System.out.println("You entered " + words);
        List<Integer> rightNums = rightMostDigit(nums);
        System.out.println("The right most digits are: " + rightNums);
        List<Integer> doubledNums = doubledValues(nums);
        System.out.println("The values doubled are: " + doubledNums);
        List<String> noXs = noX(words);
        System.out.println("The words without X's are: " + noXs);
    }

    /**
     *
     * @param list
     * @return
     */
    public static List<Integer> rightMostDigit(List<Integer> list) {
        List<Integer> rightDigits = new ArrayList<>();
        list.forEach((i) -> {
            rightDigits.add(i % 10);
        });
        return rightDigits;
    }

    /**
     *
     * @param list
     * @return
     */
    public static List<Integer> doubledValues(List<Integer> list) {
        List<Integer> doubled = new ArrayList<>();
        list.forEach((i) -> {
            doubled.add(i * 2);
        });
        return doubled;
    }

    /**
     *
     * @param list
     * @return
     */
    public static List<String> noX(List<String> list) {
        List<String> xIsGone = new ArrayList<>();
        list.forEach((s) -> {
            xIsGone.add(s.toLowerCase().replace("x", ""));
        });
        return xIsGone;
    }

}
