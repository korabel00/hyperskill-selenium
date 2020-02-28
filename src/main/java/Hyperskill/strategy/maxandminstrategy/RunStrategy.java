package Hyperskill.strategy.maxandminstrategy;

import java.util.Scanner;

public class RunStrategy {

    public static void main(String[] args) {

    final Scanner scanner = new Scanner(System.in);

    final String[] elements = scanner.nextLine().split("\\s+");
    int[] numbers = null;

        if (!elements[0].equals("EMPTY")) {
        numbers = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
    } else {
        numbers = new int[0];
    }

    final String type = scanner.nextLine();

    Finder finder = null;

        switch (type) {
        case "MIN":
            finder = new Finder(new MinFindingStrategy());
            break;
        case "MAX":
            finder = new Finder(new MaxFindingStrategy());
            break;
        default:
            break;
    }

        if (finder == null) {
        throw new RuntimeException(
                "Unknown strategy type passed. Please, write to the author of the problem.");
    }
        System.out.println(finder.find(numbers));
}
}
