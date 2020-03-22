package Hyperskill.factory_simple_and_static;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockFactoryTest {

    @Test
    void produceToyClock() {
        ClockFactory clockFactory = new ClockFactory(true);
        System.out.println(clockFactory.produce("gfn").getClass().getSimpleName());
        assertEquals("ToyClock", clockFactory.produce("gfn").getClass().getSimpleName());
    }
}