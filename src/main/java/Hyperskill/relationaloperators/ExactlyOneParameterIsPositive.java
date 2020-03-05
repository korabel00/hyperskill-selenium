package Hyperskill.relationaloperators;

import java.util.Scanner;

public class ExactlyOneParameterIsPositive {
    public static void isPositive() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean result;
        if (scanner.nextInt() > 0) {count ++;}
        if (scanner.nextInt() > 0) {count ++;}
        if (scanner.nextInt() > 0) {count ++;}
        result = count == 1;
        System.out.println(result);

    }
}

/* Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).
Otherwise, it should print false.
Sample Input 1:  1 1 1  Sample Output 1:      false
Sample Input 2:  1 0 -1 Sample Output 2:      true*/
