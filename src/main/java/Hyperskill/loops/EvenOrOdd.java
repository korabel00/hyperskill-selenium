package Hyperskill.loops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOddMethod() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        while (number != 0) {
            if (number % 2 == 0) {
                result.append("even" + "\n");
            } else {
                result.append("odd" + "\n");
            }
            number = scanner.nextInt();
        }
        System.out.println(result);
    }
}
/*
    Given a sequence of natural numbers. For each number of the sequence output "even" if the number is even, otherwise, "odd". If the number is equal to 0, the program must stop reading and processing numbers.

        Input data

        A sequence of natural numbers, each number in a new line.

        Output data

        The sequence of words "even" and "odd". Each word in a new line.

        Sample Input 1:

        1
        2
        3
        4
        0
        Sample Output 1:

        odd
        even
        odd
        even*/
