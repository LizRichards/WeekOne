package dayfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author Liz Richards
 */
public class LambdasPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = {"frog", "cat", "Lizard", "Owls", "Elephant", "alpaca", "ears"};
        String[] words2 = {"frog", "cat", "Lizard", "Owls", "elephant", "alpaca", "ears"};
        System.out.println("The array before sorting");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        System.out.println("The array after sorting shortest to longest");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (a, b) -> b.length() - a.length());
        System.out.println("The array after sorting longest to shortest");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (a, b) -> a.toLowerCase().charAt(0) - b.toLowerCase().charAt(0));
        System.out.println("The array after sorting alphabetically for first character only");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (a, b) -> a.toLowerCase().charAt(0) == 'e' ? -1 : 1);
        System.out.println("The array after sorting for E first");
        System.out.println(Arrays.toString(words));

        Arrays.sort(words2, (s1, s2) -> eFirst(s1, s2));
        System.out.println("The array after sorting for E first with the method call");
        System.out.println(Arrays.toString(words));

        List<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integers for the number list, divided by spaces");
        String input = in.nextLine();
        String[] tokens = input.split(" ");
        for (String s : tokens) {
            nums.add(Integer.parseInt(s));
        }
        System.out.println("You entered " + nums);
        List<String> moreWords = new ArrayList<>();
        System.out.println("Enter the words or chaaracter groups for the string list, divided by spaces");
        String inputWords = in.nextLine();
        String[] tokens2 = inputWords.split(" ");
        for (String s : tokens2) {
            moreWords.add(s);
        }
        System.out.println("You entered " + moreWords);

        String modifiedString = commaList(nums);

        System.out.println("The integer list after modification is:");
        System.out.println(modifiedString);

        List<String> threeAWords = threeAs(moreWords);
        System.out.println("The Strings given that start with a and have three letters are:");
        System.out.println(threeAWords);
    }

    /**
     *
     * @param a first string to compare
     * @param b second string to compare
     * @return numerical value of the result of comparing the two strings
     */
    public static int eFirst(String a, String b) {
        if (a.toLowerCase().charAt(0) == 'e') {
            return -1;
        }
        return a.toLowerCase().charAt(0) - b.toLowerCase().charAt(0);
    }

    /**
     *
     * @param li the list of integers
     * @return a modified string version of the list
     */
    public static String commaList(List<Integer> li) {
        return li.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(joining(","));
    }

    /**
     *
     * @param li the list of strings
     * @return a list of only words with 3 letters that start with a
     */
    public static List threeAs(List<String> li) {
        return li.stream().filter(s -> s.startsWith("a") && s.length() == 3).collect(Collectors.toList());
    }
}
