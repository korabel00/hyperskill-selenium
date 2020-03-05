package Hyperskill.strings;

import java.util.Scanner;

public class ExtractingSubstring {
    public static void extractSubString () {
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        String cutString = strInput.substring(startNum, endNum+1);
        System.out.println(cutString);

    }

}
/* Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes
 them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than
  the string length.

Sample Input 1: Java 0 2
Sample Output 1: Jav
*/
