package Hyperskill.loops;

import java.util.Scanner;

public class LuckyNumber {
    public static void getLucky () {
        Scanner scanner = new Scanner(System.in);
        String stringNumber = scanner.nextLine();
        String[] part1 = (stringNumber.substring(0, (stringNumber.length()/2))).split("");
        String[] part2 = (stringNumber.substring((stringNumber.length()/2))).split("");

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < part1.length; i ++) {
            sum1 += Integer.parseInt(String.valueOf(part1[i]));
            sum2 += Integer.parseInt(String.valueOf(part2[i]));
        }

        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
/*
    Given the number N with an even number of digits. If the sum of the first half of the digits equals the sum of the second half of the digits, then this number is considered lucky. For a given number, output "YES" if this number is lucky, otherwise output "NO".
        Sample Input 1:

        12344321
        Sample Output 1:

        YES
        Sample Input 2:

        125322
        Sample Output 2:

        NO
*/
