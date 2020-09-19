package com.mogu.easy;

import com.mogu.util.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
     * 两个数组的交集 II
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
    	if (nums1.length == 0  ||  nums2.length == 0)
        {
            return new int[0];
        }
    	if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
          //如果map中有值，获取其对应的value+1，否则0+1
            map.put(num, count);//将count作为num的value插入map
        }
        int[] insertArray = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {//如果map中有num2中的元素
            	insertArray[index++] = num;//将该元素加入数组
                count--;//map中该元素的个数-1
                if (count > 0) {//若-1后count>0
                    map.put(num, count);//更新map中该元素的数量
                } else {
                    map.remove(num);//否则将该元素从map中移除
                }
            }
        }
        return Arrays.copyOfRange(insertArray, 0, index);
        //将一个原始的数组insertArray，从下标0开始复制，复制到上标index，生成一个新的数组。
    }
    
    /**
     * 加一
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) 
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}