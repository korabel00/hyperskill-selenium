package Hyperskill.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/*Read an input text from the console and print the number of words. By word we mean a sequence of characters separated by one or several spaces.
        If the input is empty or there are no characters except spaces, print 0.*/

public class CountWords {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {

            char[] arrayOfChars = new char[100];
            int length = reader.read(arrayOfChars);
            int count;

            // for that case -"     there are some spaces before me"
            if (' ' == arrayOfChars[0]) {
                count = 0;
            } else {
                count = 1;
            }

            for (int i = 1; i < length; i++) {
                if (' ' != arrayOfChars[i] && ' ' == arrayOfChars[i - 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
