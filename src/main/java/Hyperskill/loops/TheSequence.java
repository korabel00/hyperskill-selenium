package Hyperskill.loops;

import java.util.Scanner;

public class TheSequence {
    public static void doSequence() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int j = 1;
        int sum = 0;
        while (i <= number) {
             while (j <= i ) {
                System.out.print(i + " ");
                j++;
                sum ++;
                if (sum == number) {
                    break;
                }
            }
            if (sum == number) {
                break;
            }
            i++;
            j = 1;
        }

    }
}
/*
    Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.

        For example, if n = 7, then the program should output 1 2 2 3 3 3 4.

        Sample Input 1:

        7
        Sample Output 1:

        1 2 2 3 3 3 4*/
