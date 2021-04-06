/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayOne;

/**
 *
 * @author LizRichards
 */
public class SimplePrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1)");
        for (int i = 1; i <= 4; i++) {
            helper(i);
        }
        System.out.println(".........");
        System.out.println();
        System.out.println("2)");
        System.out.println("..........");
        for (int i = 4; i >= 1; i--) {
            helper(i);
        }
        System.out.println();
        System.out.println("3)");
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                pyramidHelper(0, 0, 11);
            } else {
                pyramidHelper((6 - i), (i + (i - 1)), 0);
            }
        }
        System.out.println();
        System.out.println("4)");
        for (int i = 5; i >= 1; i--) {
            if (i == 5) {
                pyramidHelper(0, 0, 12);
            } else {
                pyramidHelper((6 - i), (i + (i - 1)), 0);
            }
        }
    }

    /**
     * @param num the number of * for the string
     */
    static void helper(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            str.append("*");
        }
        System.out.println(str.toString());
    }

    /**
     * @param space the number of spaces for the string
     * @param num the number of * for the string
     * @param dot the number of . for the string
     */
    static void pyramidHelper(int space, int num, int dot) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= space; i++) {
            str.append(" ");
        }
        for (int i = 1; i <= num; i++) {
            str.append("*");
        }
        for (int i = 1; i <= dot; i++) {
            str.append(".");
        }
        System.out.println(str.toString());
    }

}
