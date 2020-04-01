/*Extend your program by adding different algorithms to encode/decode data. The first one would be shifting algorithm
(it shifts each letter by the specified number according to its order in the alphabet in circle).
The second one would be based on Unicode table, like in the previous stage.

When starting the program, the necessary algorithm should be specified by an argument (-alg). The first algorithm should
be named shift, the second one should be named unicode. If there is no -alg you should default it to shift.

Remember that in case of shift algorithm you need to encode only English letters (from 'a' to 'z' as the first circle
and from 'A' to 'Z' as the second circle i.e. after 'z' comes 'a' and after 'Z" comes 'A').

1) java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode
2) java Main -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode (\jqhtrj%yt%m~ujwxpnqq&)
3) java Main -key 5 -alg unicode -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec (Welcome to hyperskill!)
4) java Main -key 5 -alg shift -data "Welcome to hyperskill!" -mode enc (Bjqhtrj yt mdujwxpnqq!)
5) java Main -key 5 -alg shift -data "Bjqhtrj yt mdujwxpnqq!" -mode dec (Welcome to hyperskill!)
*/

package Hyperskill.projects.encryption_decryption_completed;
import Hyperskill.projects.encryption_decryption_completed.consoleparsing.ConsoleParsing;


public class Main {

    public static void main(String[] args) {
        new ConsoleParsing().parse(args);
    }
}
