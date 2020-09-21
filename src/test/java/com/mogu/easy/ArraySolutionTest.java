package com.mogu.easy;

import com.mogu.util.ArrayUtils;
import com.mogu.util.RandomUtils;
import com.mogu.util.SortUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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

    @Test
    void intersect2() {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] a = test.intersect2(nums1, nums2);
        ArrayUtils.printArray(a);

        int[] nums3 = { 1, 2, 2, 1 };
        int[] nums4 = { 2, 2 };

        int[] a2 = test.intersect2(nums3, nums4);
        ArrayUtils.printArray(a2);
        int[] nums5 = { 1, 2, 2, 1 };
        int[] nums6 = { 2 };
        int[] a3 = test.intersect2(nums5, nums6);
        ArrayUtils.printArray(a3);
    }

    @Test
    void plusOne() {
        int[] nums = { 4, 9, 5 };
        int[] a = test.plusOne2(nums);
        ArrayUtils.printArray(a);
        Assertions.assertArrayEquals(a, new int[] { 4, 9, 6 });

        int[] nums2 = { 4, 9, 9 };
        int[] a2 = test.plusOne2(nums2);
        ArrayUtils.printArray(a2);
        Assertions.assertArrayEquals(a2, new int[] { 5, 0, 0 });

        int[] nums3 = { 9, 9 };
        int[] a3 = test.plusOne2(nums3);
        ArrayUtils.printArray(a3);
        Assertions.assertArrayEquals(a3, new int[] { 1, 0, 0 });
    }

    @Test
    void moveZeroes() {
        int[] nums = { 0, 4, 0, 9, 5 };
        test.moveZeroes(nums);
        ArrayUtils.printArray(nums);
        Assertions.assertArrayEquals(nums, new int[] { 4, 9, 5, 0, 0 });

        int[] nums2 = { 0, 4, 0, 0, 9, 5 };
        test.moveZeroes(nums2);
        ArrayUtils.printArray(nums2);
        Assertions.assertArrayEquals(nums2, new int[] { 4, 9, 5, 0, 0, 0 });

        int[] nums3 = { 4, 9, 5, 0, 0 };
        test.moveZeroes(nums3);
        ArrayUtils.printArray(nums3);
        Assertions.assertArrayEquals(nums3, new int[] { 4, 9, 5, 0, 0 });

        int[] nums4 = { 0, 1 };
        test.moveZeroes(nums4);
        ArrayUtils.printArray(nums4);
        Assertions.assertArrayEquals(nums4, new int[] { 1, 0 });

        int[] nums5 = { 1 };
        test.moveZeroes(nums5);
        ArrayUtils.printArray(nums5);
        Assertions.assertArrayEquals(nums5, new int[] { 1 });

        int[] nums6 = { 2, 1 };
        test.moveZeroes(nums6);
        ArrayUtils.printArray(nums6);
        Assertions.assertArrayEquals(nums6, new int[] { 2, 1 });

        int[] nums7 = { 0, 1, 0 };
        test.moveZeroes(nums7);
        ArrayUtils.printArray(nums7);
        Assertions.assertArrayEquals(nums7, new int[] { 1, 0, 0 });
    }

    @Test
    void twoSum() {
        int[] nums = { 2, 7, 11, 15 };
        int[] a = test.twoSum(nums, 9);
        ArrayUtils.printArray(a);
        Assertions.assertArrayEquals(a, new int[] { 0, 1 });

        int[] nums2 = { 2, 7, 2, 15 };
        int[] a2 = test.twoSum(nums2, 4);
        ArrayUtils.printArray(a2);
        Assertions.assertArrayEquals(a2, new int[] { 0, 2 });
    }
}