package Hyperskill.relationaloperators;

import java.util.Scanner;

public class IsBetween {
    public static void getBetween() {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        System.out.println ((numberOne >= numberTwo && numberOne <= numberThree) || (numberOne <= numberTwo && numberOne >= numberThree));
    }
}

/* Write a program that reads three integer numbers and prints true if the first number is between the second and the third one (inclusive). Otherwise, it must print false.
The sorting order of two last arguments can be any.
        Sample Input 1:        3 3 3       Sample Output 1:        true
        Sample Input 2:        40 30 50    Sample Output 2:        true
        Sample Input 3:        40 100 20   Sample Output 3:        true
*/
