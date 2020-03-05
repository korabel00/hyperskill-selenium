package Hyperskill.strings;


import java.util.Scanner;

public class PasswordGenerating {
    public static void generatePassword () {
        Scanner scanner = new Scanner(System.in);
        int numberOfUpperCaseLetters = scanner.nextInt();
        int numberOfLowerCaseLetters = scanner.nextInt();
        int numberOfDigits = scanner.nextInt();
        int totalLenght = scanner.nextInt();
        StringBuilder generatedPassword = new StringBuilder();

        char upperStart = 65;
        char lowerStart = 97;
        char numberStart = 48;
            for (int i = 0; i < numberOfUpperCaseLetters; i++) {
                generatedPassword.append(upperStart);
                upperStart ++;
                if (upperStart == 90) {
                    upperStart = 65;
                }
            }
            for (int i = 0; i < numberOfLowerCaseLetters; i++) {
                generatedPassword.append(lowerStart);
                lowerStart ++;
                if (lowerStart == 122) {
                    lowerStart = 97;
                }
            }
            for (int i = 0; i < numberOfDigits; i++) {
                generatedPassword.append(numberStart);
                numberStart ++;
                if (numberStart == 57) {
                    numberStart = 48;
                }
            }
            for (int i = 0; i < totalLenght - numberOfDigits - numberOfLowerCaseLetters - numberOfUpperCaseLetters ; i++) {
                 generatedPassword.append(numberStart);
                 numberStart ++;
                if (numberStart == 57) {
                    numberStart = 48;
                }
        }
        System.out.println(generatedPassword);
        }
    }

/*
    The password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at least C digits and includes exactly N symbols. Also, a password cannot contain two or more same characters coming one after another. For a given numbers A, B, C, N you should output password that matches these requirements.
        Sample Input 1:

        3 4 1 8
        Sample Output 1:

        PaSsw0rD*/
