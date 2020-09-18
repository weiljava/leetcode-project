package com.mogu.easy;

import com.mogu.util.ArrayUtils;
import com.mogu.util.RandomUtils;
import com.mogu.util.SortUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


    //删除排序数组中的重复项
    @Test
    void removeDuplicates() {
        int[] nums = SortUtils.bubbleSort(RandomUtils.randomIntArray(10, 5));
        ArrayUtils.printArray(nums);
        int a = test.removeDuplicates(nums);
        System.out.println(a);
    }


    //获取2个数组的交集
    @Test
    void arrayIntersect() {
        int[] nums1 = {4, 9, 5};
        ArrayUtils.printArray(nums1);
        int[] nums2 = {9, 4, 9, 8, 4};
        ArrayUtils.printArray(nums2);
        int[] result = test.arrayIntersect(nums1, nums2);
        ArrayUtils.printArray(result);
    }


    //数组加1
    @Test
    void arrayAddOne() {
        int[] nums1 = {9, 9, 9};
        ArrayUtils.printArray(nums1);
        ArrayUtils.printArray(test.arrayAddOne(nums1));
        int[] nums2 = {9, 4, 9, 9, 9};
        ArrayUtils.printArray(nums2);
        ArrayUtils.printArray(test.arrayAddOne(nums2));
        int[] nums3 = {9, 9, 2};
        ArrayUtils.printArray(nums3);
        ArrayUtils.printArray(test.arrayAddOne(nums3));
    }

    //外观数组
    @Test
    void appearanceArray() {
        int index = 10;
        System.out.println("输出外观数组第" + index + "行");
        System.out.println(test.appearanceArray(index));
    }


}