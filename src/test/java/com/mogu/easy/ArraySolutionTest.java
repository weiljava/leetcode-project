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
    void plusOne(){
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,9,9};
        int[] nums3 = {9,9,9};
        int[] result1 = test.plusOne(nums1);
        int[] result2 = test.plusOne(nums2);
        int[] result3 = test.plusOne(nums3);
        ArrayUtils.printArray(result1);
        ArrayUtils.printArray(result2);
        ArrayUtils.printArray(result3);
    }

    @Test
    void intersect(){
        int[] nums1 = {1,2,3,3,4,8};
        int[] nums2 = {1,9,2,2,3,3,6,8};
        int[] result = test.intersect(nums1,nums2);
        ArrayUtils.printArray(result);
    }
}