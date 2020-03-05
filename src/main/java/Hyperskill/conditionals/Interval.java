package Hyperskill.conditionals;

import java.util.Scanner;

public class Interval {
    public static void judgeInterval () {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num > -15 && num <=12) || (num > 14 && num <17) || (num >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}

/*Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).
Please note the different brackets, which are used to specify intervals. The problem uses semi-open and open intervals. You can read more about it on Wikipedia.
        Sample Input 1:
        20
        Sample Output 1:
        True
        Sample Input 2:
        -20
        Sample Output 2:
        False*/
