package com.mogu.easy;

import com.mogu.util.SortUtils;
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
        Assertions.assertEquals(test.reverse(120), 21);
        Assertions.assertEquals(test.reverse(1534236469), 0);
    }

    @Test
    void firstUniqChar() {
        Assertions.assertEquals(test.firstUniqChar("leetcode"), 0);
        Assertions.assertEquals(test.firstUniqChar("loveleetcode"), 2);
    }

    @Test
    void strStr() {
        Assertions.assertEquals(test.strStr("abcdef", "ef"), 4);
        Assertions.assertEquals(test.strStr("hello", "ll"), 2);
        Assertions.assertEquals(test.strStr("aaaaa", "bba"), -1);
        Assertions.assertEquals(test.strStr("aaaaa", ""), 0);
        Assertions.assertEquals(test.strStr("a", "a"), 0);
        Assertions.assertEquals(test.strStr("mississippi", "issip"), 4);
    }
}