package com.mogu.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSolutionTest {

    private StringSolution test;
    private long startTime;
    private long endTime;

    @BeforeEach
    void setUp() {
        test = new StringSolution();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void reverseString() {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        test.reverseString(s);
        Assertions.assertArrayEquals(s, new char[] { 'o', 'l', 'l', 'e', 'h' });
    }

    @Test
    void reverse() {
        Assertions.assertEquals(test.reverse(123), 321);
        Assertions.assertEquals(test.reverse(-123), -321);
        Assertions.assertEquals(test.reverse(120), 12);

    }
}