package Hyperskill.integers;

import java.util.Scanner;

public class SquirrelsAndNuts1 {

    public static void squirrelNutsMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество белок");
        int squirrelNumber = scanner.nextInt();
        System.out.println("Введите количество орехов");
        int nutsNumber = scanner.nextInt();
        System.out.println(nutsNumber/squirrelNumber );

    }


}
