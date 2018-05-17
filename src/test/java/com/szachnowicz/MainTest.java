package com.szachnowicz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void simpleRandomTest1() {
        long l = System.currentTimeMillis();
        assertTrue(l % 1 == 0);
    }

    @Test
    public void simpleRandomTest2() {
        long l = System.currentTimeMillis();
        assertTrue(l % 2 == 0);
    }

    @Test
    public void simpleRandomTest3() {
        long l = System.currentTimeMillis();
        assertTrue(l % 3 == 0);
    }

    @Test
    public void simpleRandomTest4() {
        long l = System.currentTimeMillis();
        assertTrue(l % 4 == 0);
    }


}
