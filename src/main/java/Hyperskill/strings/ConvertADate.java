package Hyperskill.strings;

import java.util.Scanner;

public class ConvertADate {
    public static void getConvert () {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String [] stringArr = inputStr.split("-");
        int[] intArr = new int[stringArr.length];
        boolean incorrect = false;
        //get array of ints instead of strings
        for (int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        // incorrect year
        if (intArr[0] <= 0) {
            incorrect = true;
        }
        //incorrect month
        if (intArr[1] <= 0 || intArr[1] > 12) {
            incorrect = true;
        }
        //incorrect day
        if (intArr[2] <= 0 || intArr[2] > 31) {
            incorrect = true;
        }
        //output
        if (incorrect) {
            System.out.println("Incorrect input");
        } else {
            System.out.println(stringArr[1] + "/" + stringArr[2] + "/" + stringArr[0]);
        }
    }
}
/*    Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

        For instance, the input 2007-07-21 will result in the following output 07/21/2007.

        The program must print "Incorrect input" if the date is not possible. Assume that every month has 31 days and that the year, month or day cannot be 0 (or 00).
        Sample Input 1:

        2012-09-28
        Sample Output 1:

        09/28/2012*/
