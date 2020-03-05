package Hyperskill.loops;

import java.util.Scanner;

public class Profit {
    public static void getProfit() {
        Scanner scanner = new Scanner(System.in);
        float moneyIPut = scanner.nextInt();
        float percent = scanner.nextInt()/100f;
        float moneyIWant = scanner.nextInt();
        int years = 0;

        while (moneyIPut < moneyIWant) {
            moneyIPut = moneyIPut + moneyIPut*percent;
            years ++;
        }
        System.out.println(years);
    }
}
/*    Ann put M M money in the bank. The bank increases Ann's deposit by P P percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches K K money. Can you help her to answer this question?

        Input contains three integers - M, P, K M,P,K. It is guaranteed that all numbers are positive and K \geq M K≥M.
        Output the answer to Ann's question.
        Sample Input 1:

        1 100 8
        Sample Output 1:

        3
        Sample Input 2:

        100 15 120
        Sample Output 2:

        2*/
