package Hyperskill.factorypattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TimeTest {

        @Test
    void noon() {
    }

    @Test
    void midnight() {
    }

    @Test
    void ofSeconds() {
        Time longSeconds = Time.ofSeconds(500000);
        assertEquals(18,longSeconds.hour);
        assertEquals(53,longSeconds.minute);
        assertEquals(20,longSeconds.second);
        System.out.println(longSeconds.hour);
        System.out.println(longSeconds.minute);
        System.out.println(longSeconds.second);
    }

    @Test
    void of() {
        Time of = Time.of(24, 10,10);
        assertNull(of);
        System.out.println(of);
    }
}