package Hyperskill.projects.encryption_decryption_completed.algorithms;

public class ShiftAlgorithm extends Algorithm {

    @Override
    public String encryption(String message, int shift) {
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);
            // if c is letter ONLY then shift them, else directly add it
            if (Character.isLetter(c)) {
                c = (char) (message.charAt(i) + shift);
                // checking case or range check is important, just if (c > 'z'
                // || c > 'Z')
                // will not work
                if ((Character.isLowerCase(message.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(message.charAt(i)) && c > 'Z'))
                    c = (char) (message.charAt(i) - (26 - shift));
            }
            strBuilder.append(c);
        }
        return strBuilder.toString();
    }

    @Override
    public String decryption(String message, int shift) {
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);
            // if c is letter ONLY then shift them, else directly add it
            if (Character.isLetter(c)) {
                c = (char) (message.charAt(i) - shift);
                // checking case or range check is important, just if (c > 'a'
                // || c > 'A')
                // will not work
                if ((Character.isLowerCase(message.charAt(i)) && c < 'a')
                        || (Character.isUpperCase(message.charAt(i)) && c < 'A'))
                    c = (char) (message.charAt(i) + (26 - shift));
            }
            strBuilder.append(c);
        }
        return strBuilder.toString();
    }
}