package Hyperskill.relationaloperators;

import java.util.Scanner;

public class Groundhogs {
    public static void throwParty() {
        Scanner scanner = new Scanner(System.in);
        int cupsAmount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isPartyGoodOnWeekends = (cupsAmount >= 15 && cupsAmount <= 25) && isWeekend;
        boolean isPartyGoodOnWeekdays = (cupsAmount >= 10 && cupsAmount <= 20) && !isWeekend;
        System.out.println(isPartyGoodOnWeekdays || isPartyGoodOnWeekends );
    }
}


/*    Groundhogs like to throw fun parties, and at their parties, they like to eat Reeses peanut butter cups.
But not too many Reeses or they feel sick! A successful groundhog party will have between 10 and 20 Reeses peanut butter cups,
inclusive unless it is the weekend, in which case they will need 15 to 25 Reeses peanut butter cups, inclusive.

        Write a Java program that reads two values:
        the first is the number of Reeses peanut butter cups;
        the second is a boolean representing whether it is the weekend.
        The program must print the boolean value - the party is successful or not.

        Sample Input 1:        5 true       Sample Output 1:        false
        Sample Input 2:        16 false     Sample Output 2:         true
        */
