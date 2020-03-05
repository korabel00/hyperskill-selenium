package Hyperskill.relationaloperators;

import java.util.Scanner;

public class BoysInASportClass {
    public static void orderBoys() {
        Scanner scanner = new Scanner(System.in);
        int heightOne = scanner.nextInt();
        int heightTwo = scanner.nextInt();
        int heightThree = scanner.nextInt();
        boolean asc = heightOne >= heightTwo && heightTwo >= heightThree;
        boolean desc = heightOne <= heightTwo && heightTwo <= heightThree;
        System.out.println(asc || desc);
    }
}

/*Suppose there are three boys in a sports class.
 You need to write a program that checks the boys are arranged in the ascending or descending order by height. The program must read three integer numbers h1, h2, h3 and outputs true or false. If boys have the same height, they are considered as correctly arranged.
 Sample Input 1:   165 161 158    Sample Output 1:       true
 Sample Input 2:   155 165 160    Sample Output 2:       false
 Sample Input 3:   161 161 165    Sample Output 3:       true*/