package Hyperskill.commandline;

public class Problem {
    public static void CommandLineCalculator(String[] args) {
        switch (args[0]) {
            case "+":
                System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(args[1]) * Integer.parseInt(args[2]));
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
/*
    Write a program that takes an operator ("+", "-", "*") and two values as the command-line arguments and then outputs the result of the operator in the standard output. If the passed operator is not from the list, it must output the string "Unknown operator" without quotes.

        Please, do not rename the provided class Problem.
        Sample Input 1:

        + 10 20
        Sample Output 1:

        30
        Sample Input 2:

        ^ 2 10
        Sample Output 2:*/
