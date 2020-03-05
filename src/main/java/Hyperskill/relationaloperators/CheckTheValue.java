package Hyperskill.relationaloperators;

import java.util.Scanner;

public class CheckTheValue {
    public static void CheckValueMethod() {
        Scanner scanner = new Scanner(System.in);
        int valueToCheck = scanner.nextInt();
        boolean checkResult = (valueToCheck > 0) && (valueToCheck < 10);
        System.out.println(checkResult);
    }
}
/*
    Write a program that reads a value and checks it is less than 10 and greater than 0.
    The result is a boolean value (true or false).
    Sample Input 1:        0      Sample Output 1:       false
*/
