package Hyperskill.strings;

import java.util.Scanner;

public class ComparingStrings {
    public static void compareIt () {
        Scanner scanner = new Scanner(System.in);
        String strOne = scanner.nextLine().replace(" ", "");
        String strTwo = scanner.nextLine().replace(" ", "");
        System.out.println(strOne.equals(strTwo));
    }
}

/*
Write a program that reads two strings and compares them without whitespaces. The program should prints true if both strings are equal, otherwise - false.
        Sample Input 1:

        string
        str ing
        Sample Output 1:

        true
        Sample Input 2:

        string
        my string
        Sample Output 2:

        false*/
