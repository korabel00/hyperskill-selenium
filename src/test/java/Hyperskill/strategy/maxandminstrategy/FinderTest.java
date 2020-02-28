package Hyperskill.strategy.maxandminstrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    // MAX  1 2 3
    @Test
    void findMax1() {
        Finder finer = new Finder(new MaxFindingStrategy());
        assertEquals(3, finer.find(new int[]{1, 2, 3}));
    }

    // MIN  -10 200 3
    @Test
    void findMin1() {
        Finder finer = new Finder(new MinFindingStrategy());
        assertEquals(-10, finer.find(new int[]{-10, 200, 3}));
    }

    // Integer.MAX_VALUE Null Array
    @Test
    void findNullMax() {
        Finder finer = new Finder(new MaxFindingStrategy());
        assertEquals(2147483647, finer.find(null));
    }

    // Integer.MIN_VALUE Null Array
    @Test
    void findNullMin() {
        Finder finer = new Finder(new MinFindingStrategy());
        assertEquals(-2147483648, finer.find(null));
    }

    // Integer.MAX_VALUE {} Array
    @Test
    void findZeroMax() {
        Finder finer = new Finder(new MaxFindingStrategy());
        assertEquals(2147483647, finer.find(new int[0]));
    }

    // Integer.MIN_VALUE {} Array
    @Test
    void findZeroMin() {
        Finder finer = new Finder(new MinFindingStrategy());
        assertEquals(-2147483648, finer.find(new int[0]));
    }

    // Integer.MAX_VALUE {1} Array
    @Test
    void findOne() {
        Finder finer = new Finder(new MaxFindingStrategy());
        assertEquals(200, finer.find(new int[]{200}));
    }

    @Test
    void findOne2() {
        Finder finer = new Finder(new MaxFindingStrategy());
        assertEquals(-2001, finer.find(new int[]{-2001}));
    }
}