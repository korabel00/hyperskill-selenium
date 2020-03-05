package Hyperskill.strings;

import java.util.Locale;
import java.util.Scanner;

public class CreateAEuphoniousWord {
    public static void createIt () {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine().toUpperCase(Locale.US);
        int vowelsCount = 0;
        int consonantsCount = 0;
        int resultCount = 0;

        if (inputStr.charAt(0) == 'A' || inputStr.charAt(0) == 'E' || inputStr.charAt(0) == 'I' || inputStr.charAt(0) == 'O' || inputStr.charAt(0) == 'U' || inputStr.charAt(0) == 'Y') {
            vowelsCount++;
        }
        else {
            consonantsCount++;
        }
     //   System.out.println(inputStr.charAt(0) + " Result:" + resultCount + " Consonant:" + consonantsCount + " Vowel:" + vowelsCount + " ");
        for (int i = 1; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == 'A' || inputStr.charAt(i) == 'E' || inputStr.charAt(i) == 'I' || inputStr.charAt(i) == 'O' || inputStr.charAt(i) == 'U' || inputStr.charAt(i) == 'Y') {
                vowelsCount++;
            }
            else {
                consonantsCount++;
            }
            if  ((inputStr.charAt(i) == 'A' || inputStr.charAt(i) == 'E' || inputStr.charAt(i) == 'I' || inputStr.charAt(i) == 'O' || inputStr.charAt(i) == 'U' || inputStr.charAt(i) == 'Y') != (inputStr.charAt(i-1) == 'A' || inputStr.charAt(i-1) == 'E' || inputStr.charAt(i-1) == 'I' || inputStr.charAt(i-1) == 'O' || inputStr.charAt(i-1) == 'U' || inputStr.charAt(i-1) == 'Y')) {vowelsCount = 1; consonantsCount = 1;}
         //   System.out.println(inputStr.charAt(i) + " Result:" + resultCount + " Consonant:" + consonantsCount + " Vowel:" + vowelsCount + " ");
            if (consonantsCount == 3 || vowelsCount == 3) {
                resultCount++;
                consonantsCount = 1;
                vowelsCount = 1;
            }
        }
        System.out.println(resultCount);
    }
}
/*
    All the letters of the English alphabet are divided into vowels and consonants.
        The vowels are: a, e, i, o, u, y.
        The remaining letters are consonants.

        A word is considered euphonious if it has not three or more vowels or consonants in a row. Otherwise, it is considered discordant.

        Your task is to create euphonious words from discordant. You can insert any letters inside word. You should output the minimum number of characters needed to create a euphonious word from a given word.

        For example, word "schedule" is considered discordant because it has three consonants in a row - "sch". To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.

        Sample Input 1:

        schedule
        Sample Output 1:

        1
        Sample Input 2:

        garage
        Sample Output 2:

        0
        Sample Input 3:

        player
        Sample Output 3:

        1
        Sample Input 4:

        biiiiig
        Sample Output 4:

        2*/
