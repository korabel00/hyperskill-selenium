package Hyperskill.loops;

import java.util.Scanner;

public class ArithmeticAverage {
    public static void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int i;
        int sum = 0;
        float count = 0;

        for (i = start; i <= end; i ++ ) {
            if (i % 3 == 0) {
                sum += i;
                count ++;
            }
        }
        System.out.println(sum/count);

    }
}
/*
    Write a program that reads two numbers a a and b b from the keyboard and calculates and outputs to the console the arithmetic average of all numbers from the interval [a; b] [a;b], which are divisible by 3 3.

        In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12] [−5;12]. Total numbers divisible by 3 3 on this interval 6 6: -3, 0, 3, 6, 9, 12 −3,0,3,6,9,12. Their arithmetic average equals to 4.5 4.5

        The program input contains intervals, which always contain at least one number, which is divisible by 3 3.

        Sample Input 1:

        -5
        12
        Sample Output 1:

        4.5*/
