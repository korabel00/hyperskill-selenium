package Hyperskill.PatternsConstructorsOverloadMethods;

public class StringFormat {
    public static void print(String strArg) {
        System.out.println(String.format("print(\"%s\")", strArg));
    }

    // write your method here
    public static void print(String strArg, int val) {
        System.out.println(String.format("print(\"%s\", %d)", strArg , val));
    }

    /* Do not change code below */
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
     //   String str = scanner.nextLine();
     //   int val = scanner.nextInt();
        print("test");
        print("test", 4);
    }
}
