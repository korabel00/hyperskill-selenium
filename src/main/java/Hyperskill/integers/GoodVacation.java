package Hyperskill.integers;/*Write a program that will help people who are going on vacation. The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.

        There are four parameters which have to be considered:
        duration in days
        total food cost per a day
        one-way flight cost
        cost of one night in a hotel (the number of nights equal duration minus one)
        Read values of these parameters from the standard input and then print the result.

Sample Input 1: 7 30 100 40
Sample Output 1: 650*/
import java.util.Scanner;

public class GoodVacation {
    static void getVacationSum() {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int coastOfFood = scanner.nextInt();
        int coastOfOneFlight = scanner.nextInt();
        int coastNightHotel = scanner.nextInt();
        System.out.println(duration*coastOfFood + coastOfOneFlight*2 + coastNightHotel*(duration-1));
    }


}
