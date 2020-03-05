package Hyperskill.incrementdecrement;

import java.util.Scanner;

public class DecrementAll {

    public static void decrementIt() {
        Scanner scanner = new Scanner(System.in);
        int digitOne = scanner.nextInt();
        int digitTwo = scanner.nextInt();
        int digitThree = scanner.nextInt();
        int digitFour = scanner.nextInt();
        System.out.println( --digitOne  + " "  + --digitTwo + " " + --digitThree + " " + --digitFour );


    }
}
/* Write a program that reads four numbers and decrements each of them.
   The program must output the results in the same order separated by spaces.
   Sample Input 1:        10 11 -2 -3
   Sample Output 1:       9 10 -3 -4*/
