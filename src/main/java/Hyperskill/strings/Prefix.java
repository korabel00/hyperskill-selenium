package Hyperskill.strings;

import java.util.Locale;
import java.util.Scanner;

public class Prefix {

    public static void checkPrefix () {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase(Locale.ENGLISH);
        System.out.println(s.startsWith("J"));
    }
}
/*Write a program that checks a given string starts with the prefix "J" ignoring the case.
        The program should output true or false.
        Sample Input 1:        Java        Sample Output 1:         true
        Sample Input 2:        Kotlin      Sample Output 2:         false*/