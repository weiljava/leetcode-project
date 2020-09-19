package com.mogu.easy;

import com.mogu.util.ArrayUtils;

import java.util.HashMap;
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
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[n]){
                n++;
                nums[n] = nums[i];
            }
        }
        ArrayUtils.printArray(nums);
        return n+1;
    }

    /**
     * 两个数组的交集
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums1.length;i++){
            if (map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        int[] array = new int[nums2.length];
        int n = -1;
        for (int i = 0;i<nums2.length;i++){
            if (map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                n++;
                map.put(nums2[i],map.get(nums2[i])-1);
                array[n] = nums2[i];
            }
        }
        int[] result = new int[n+1];
        for (int i = 0;i<n+1;i++){
            result[i] = array[i];
        }
        return result;
    }

    /**
     * 加一
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i = length - 1;i>-1;i--){
            digits[i] += 1;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0){
                return digits;
            }else{
                continue;
            }
        }
        int[] nums = new int[length + 1];
        nums[0] = 1;
        return nums;
    }
}