package com.mogu.easy;

import com.mogu.util.ArrayUtils;
import com.mogu.util.RandomUtils;
import com.mogu.util.SortUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySolutionTest {
    private ArraySolution test;
    private long startTime;
    private long endTime;

    @BeforeEach
    void setUp() {
        test = new ArraySolution();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void removeDuplicates() {
        int[] nums = SortUtils.bubbleSort(RandomUtils.randomIntArray(10, 5));
        ArrayUtils.printArray(nums);
        int a = test.removeDuplicates(nums);
        System.out.println(a);
    }

    @Test
    void rotate() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        ArrayUtils.printArray(nums);
        test.rotate(nums, 3);

        System.out.println("==========");
        int[] nums2 = { -1, -100, 3, 99 };
        ArrayUtils.printArray(nums2);
        test.rotate(nums2, 2);
    }

    @Test
    void containsDuplicate() {
        int[] nums = { 1, 3, 4, 2 };
        boolean b = test.containsDuplicate(nums);
        System.out.println(b);
    }

    @Test
    void singleNumber() {
        int[] nums = { 4, 1, 2, 1, 2 };
        int a = test.singleNumber(nums);
        System.out.println(a);
    }

    @Test
    void intersect() {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] a = test.intersect(nums1, nums2);
        ArrayUtils.printArray(a);

        int[] nums3 = { 1, 2, 2, 1 };
        int[] nums4 = { 2, 2 };

        int[] a2 = test.intersect(nums3, nums4);
        ArrayUtils.printArray(a2);
        int[] nums5 = { 1, 2, 2, 1 };
        int[] nums6 = { 2 };
        int[] a3 = test.intersect(nums5, nums6);
        ArrayUtils.printArray(a3);
    }
}