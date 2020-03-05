package Hyperskill.integers;/*Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
        Sample Input 1:
        476
        Sample Output 1:
        17*/

import java.util.Scanner;

public class NumbersSum {
    static void getSumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber/100 + inputNumber/10 % 10 + inputNumber % 10 );
    }
}
