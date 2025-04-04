package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testIsEmpty() {
        assertTrue(utils.isEmpty(""));
        assertTrue(utils.isEmpty(null));
        assertFalse(utils.isEmpty("Hello"));
    }

    @Test
    void testReverse() {
        assertEquals("olleH", utils.reverse("Hello"));
        assertNull(utils.reverse(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertNull(utils.toUpperCase(null));
    }

    @Test
    void testToLowerCase() {
        assertEquals("hello", utils.toLowerCase("HELLO"));
        assertNull(utils.toLowerCase(null));
    }

    @Test
    void testCountVowels() {
        assertEquals(2, utils.countVowels("Hello"));
        assertEquals(0, utils.countVowels("bcdfg"));
    }
}
