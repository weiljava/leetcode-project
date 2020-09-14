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
     * 两个数组的交集 II
     * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !map.containsKey(i) && !map.containsValue(j)) {
                    map.put(i, j);
                    break;
                }
            }
        }
        System.out.println(map.toString());
        int[] a = new int[map.size()];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            a[k] = nums1[entry.getKey()];
            k++;
        }
        return a;
    }

    /**
     * 两个数组的交集 II
     * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] a = new int[length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !map.containsKey(i) && !map.containsValue(j)) {
                    map.put(i, j);
                    a[index] = nums1[i];
                    index++;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(a, 0, index);
    }
}