package Hyperskill.loops;

import java.util.Scanner;

public class Divisible {
    public static void countDivisible() {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        int divNumber = scanner.nextInt();
        int count = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % divNumber == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
    Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

        Note:  it is possible to write this program more efficiently without any loops.

        Sample Input 1:

        10 20 10
        Sample Output 1:

        2
        Sample Input 2:

        15 25 5
        Sample Output 2:

        3*/
