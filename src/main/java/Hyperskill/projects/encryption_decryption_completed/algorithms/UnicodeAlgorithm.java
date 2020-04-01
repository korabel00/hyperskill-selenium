package Hyperskill.projects.encryption_decryption_completed.algorithms;

public class UnicodeAlgorithm extends Algorithm {

    @Override
    public String encryption (String message, int shift) {
        int ascii;
        char charToSting;
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            charToSting = message.charAt(i);
        //    if (Character.isLetter(charToSting)) {
                ascii = charToSting;
                charToSting = (char) (ascii + shift);
          //  }
            newStr.append(charToSting);
        }
        return newStr.toString();
    }

    @Override
    public String decryption(String message, int shift) {
        int ascii;
        char charToSting;
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            charToSting = message.charAt(i);
     //       if (Character.isLetter(charToSting)) {
                ascii = charToSting;
                charToSting = (char) (ascii - shift);
       //     }
            newStr.append(charToSting);
        }
        return newStr.toString();
    }
}
