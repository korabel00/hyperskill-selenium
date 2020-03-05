package Hyperskill.commandline;

public class TheIndexOfAnArgument {
    public static void getIndex(String[] args) {
        boolean found = false;
        for (int i = 0; i <= args.length-1; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                found = true;
            }
            System.out.println(i + " " + found);
           if (i == args.length-1 && !found) {
               System.out.println("-1");
           }
        }
    }

}
/*
    Write a program that searches for an argument equal to "test" (without quotes), and then outputs its index in the array args. If it is not found, the program must output "-1".

        Please, do not rename the provided class Problem.

        Sample Input 1:

        arg1 arg2 test
        Sample Output 1:

        2
        Sample Input 2:

        arg1 arg2 arg3
        Sample Output 2:

        -1*/
