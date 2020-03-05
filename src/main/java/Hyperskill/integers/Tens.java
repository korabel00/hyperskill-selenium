package Hyperskill.integers;/*Given a non-negative integer N (0 ≤ N ≤ 1000000), find the number of tens in it (i.e. next to last digit of the number).
If there is no next to last digit, you can consider that the number of tens equals to zero.*/

import java.util.Scanner;

public class Tens {
    public static void tenCount() {
        System.out.print(new Scanner(System.in).nextInt() % 100 / 10);
    }

}
