package Hyperskill.commandline;

public class Calculator2 {
    public static void calculateIt(String[] args) {
        int result = 0;
        switch(args[0]) {
            case  ("MAX"):
                result = Integer.parseInt(args[1]);
                for (int i = 2; i < args.length; i++ ) {
                    if (Integer.parseInt(args[i]) > result) {
                        result = Integer.parseInt(args[i]);
                    }
                }
                break;
            case ("MIN"):
                result = Integer.parseInt(args[1]);
                for (int i = 2; i < args.length; i++ ) {
                    if (Integer.parseInt(args[i]) < result) {
                        result = Integer.parseInt(args[i]);
                    }
                }
                break;
            case ("SUM"):
                for (int i = 1; i < args.length; i++ ) {
                        result += Integer.parseInt(args[i]);
                    }
                break;
        }
        System.out.println(result);
    }
}
/*
    Write a program that takes an operator ("MAX", "MIN", "SUM") and a sequence of numbers as the command-line arguments and then outputs the result of the operator in the standard output.

        The description of the operators:

        "MAX" finds the max value of a sequence of numbers;
        "MIN" find the min value of a sequence of numbers
        "SUM" calculates the sum of a sequence of numbers.
        It is guaranteed that a correct operator and at least one number will be passed to the program.

        Please, do not rename the provided class Problem.

        Sample Input 1:

        MAX 7 3 4 1 8 11 3 2
        Sample Output 1:

        11*/
