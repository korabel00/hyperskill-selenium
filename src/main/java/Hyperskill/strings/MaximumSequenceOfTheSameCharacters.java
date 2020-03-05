package Hyperskill.strings;

import java.util.Scanner;

public class MaximumSequenceOfTheSameCharacters {
    public static void getNumberOfChars () {
        Scanner scanner = new Scanner(System.in);
        String inputURL = scanner.nextLine();
        int count = 1;
        int maxCount = 0;
        boolean singleLetter = true;

        if (inputURL.length() > 1) {
            for (int i = 0; i < inputURL.length() - 1; i++) {
                if (inputURL.charAt(i) == inputURL.charAt(i + 1)) {
                    count++;
                 //   System.out.println("Count: " + count);
                    if (maxCount < count) {maxCount = count;}
                }
                else {
                    singleLetter = false;
                    if (maxCount < count) {maxCount = count;}
                    count = 1;
                  //  System.out.println("MaxCount: " + maxCount);
                }
            }
        }
        else if (inputURL.length() == 0) {maxCount = 0;}
        else if (inputURL.length() == 1) {maxCount = 1;}

        if (singleLetter && inputURL.length() > 0) {
            System.out.println("CountResult: " + count);
        }
        else {System.out.println("MaxCountResult: " + maxCount);}
    }
}
/*
    For a given string you need to find a length of the maximum sequence containing only same characters.

        The input string could be empty.

        Sample Input 1:

        abcccdd
        Sample Output 1:

        3
        Sample Input 2:

        abbbbccd
        Sample Output 2:

        4
*/
