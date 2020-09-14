package com.mogu.easy;

import com.mogu.util.ArrayUtils;

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
}