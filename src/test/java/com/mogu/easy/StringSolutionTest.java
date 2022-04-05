package com.mogu.easy;

import org.junit.jupiter.api.AfterEach;
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
    void main() {
        boolean b = test.main("abc12");
        System.out.println(b);
        boolean c = test.main("sfsdgsd");
        System.out.println(c);
    }
}