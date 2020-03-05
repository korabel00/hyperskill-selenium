package Hyperskill.integers;

import java.util.Scanner;

public class ReversingNumbers {

    public static void reverseNum() {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
       // System.out.println((inputNum % 10) * 100);
       // System.out.println(((inputNum / 10 ) % 10)*10);
      //  System.out.println(inputNum / 100);
        System.out.println(inputNum % 10 * 100 + inputNum / 10  % 10*10 + inputNum / 100);
    }
}

 /*  Write a program that reads a three digit number, calculates the new number by reversing its digits, and outputs a new number.
        Sample Input 1:    976      Sample Output 1:     679*/