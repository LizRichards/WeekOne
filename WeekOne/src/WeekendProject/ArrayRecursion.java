package WeekendProject;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Liz Richards
 */
public class ArrayRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] nums;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of numbers in the array");
        nums = new int[in.nextInt()];
        System.out.println("Enter the integers for the number array, divided by spaces");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(in.next());
        }
        System.out.println("You entered " + Arrays.toString(nums));
        elimDoubles(nums);
        System.out.println("Enter the number you want to check if a valid sum can be formed by the array");
        int sum = in.nextInt();
        boolean works = groupSumClump(0, nums, sum);
        System.out.println(works);
    }

    /**
     *
     * @param start the starting index to add by
     * @param nums the array of numbers
     * @param target the number to be added to
     * @return true or false if the target can be met with the numbers provided
     * in the array
     */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSumClump(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (groupSumClump(start + 1, nums, target)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param nums the array of integers to remove consecutive doubles from
     */
    public static void elimDoubles(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int clusterStart = 0;
        int clusterNum = nums[clusterStart];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == clusterNum) {
                nums[clusterStart] += nums[i];
                nums[i] = 0;
            } else {
                clusterStart = i;
                clusterNum = nums[i];
            }
        }
    }

}
