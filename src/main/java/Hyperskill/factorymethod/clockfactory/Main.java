/*Given classes are the Clock interface of products, specified clocks, and the factory class ClockFactory to produce instances.

Your task is to implement the factory method produce. It should return a clock according to the specified type string:

"Sand" — SandClock;
"Digital" — DigitalClock;
"Mech" — MechanicalClock.*/

package Hyperskill.factorymethod.clockfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.next();
        final ClockFactory clockFactory = new ClockFactory();
        final Clock clock = clockFactory.produce(type);
        clock.tick();
        scanner.close();
    }
}