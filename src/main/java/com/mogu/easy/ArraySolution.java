package com.mogu.easy;

import com.mogu.util.ArrayUtils;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/11
 * Time: 10:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ArraySolution {

    /**
     * 删除排序数组中的重复项
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.print("i=" + i + ",j=" + j + "=======");
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            ArrayUtils.printArray(nums);
        }
        ArrayUtils.printArray(nums);
        return j + 1;
    }


    /**
     * 旋转数组
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        while (k > 0) {
            int temp = nums[length - 1];
            for (int i = length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            ArrayUtils.printArray(nums);
            k--;
        }
    }


    /**
     * 存在重复元素
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }


    /**
     * 只出现一次的数字
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return -1;
    }

    /**
     * 删除排序数组中的重复项
     *
     * @param nums
     * @return
     */
    public int filterSingleNum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        for (i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    /**
     * 两个数组的交集
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] intersection(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            Integer value = map.get(arr1[i]);
            if (value == null) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], ++value);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                Integer checkValue = map.get(arr2[i]);
                if (checkValue > 0) {
                    list.add(arr2[i]);
                    map.put(arr2[i], --checkValue);
                }
            }
        }

        int[] returnArr = new int[list.size()];
        int index = 0;
        for (int value : list) {
            returnArr[index++] = value;
        }
        return returnArr;
    }
}