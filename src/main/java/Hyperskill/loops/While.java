package Hyperskill.loops;

import java.util.Scanner;

public class While {
    public static void getSum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
/*
    Find the sum of all elements of a sequence, ending with the number 0.

        The number 0 itself is not included into the sequence and serves as a sign of cessation.

        Sample Input 1:
        3
        6
        8
        0
        Sample Output 1:
        17
*/
