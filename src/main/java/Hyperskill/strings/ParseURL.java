package Hyperskill.strings;

import java.util.Scanner;

public class ParseURL {
    public static void parseIt() {
        Scanner scanner = new Scanner("https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost");
        String inputURL = scanner.nextLine();
        String [] parts = inputURL.split("\\?");
        String [] parameters = parts[1].split("[&=]");
        String password = "";

        for (int i = 0; i < parameters.length; i++) {
            if (i % 2 == 0) {
                if (parameters[i].equals("pass")) {
                    password = parameters[i+1];
                }
                System.out.print(parameters[i]+ " : ");
            }
            else if (parameters[i].equals("")) {
                System.out.println("not found");
            }
            else {
                System.out.println(parameters[i]);
            }
        }
        if (!password.equals("")) {
            System.out.println("password : " + password);
        }

    }
}
/*    You want to hack a website and get all available parameters. Print them "key : value". If you find the password (parameter pass), you should print it after all parameters like in the sample. If a parameter doesn't have value print "not found".

        Note: the order of parameters should like as in the url. If a url does not contain parameter pass, do not print anything after parameters

        Advice: learn the structure of URL.

        Sample Input 1:

        https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
        Sample Output 1:

        pass : 12345
        port : 8080
        cookie : not found
        host : localhost
        password : 12345*/
