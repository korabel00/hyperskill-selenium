package Hyperskill.conditionals;

import java.util.Scanner;

public class Triangle {
    public static void checkNumber () {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b + c > a && c + a > b && a + b > c) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

/*
 Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
If the triangle exists - output the YES string, otherwise - output NO.
Note, a triangle is formed by three connected points that are not located on a single straight line.
Sample Input 1:
3
4
5
Sample Output 1:
YES*/
