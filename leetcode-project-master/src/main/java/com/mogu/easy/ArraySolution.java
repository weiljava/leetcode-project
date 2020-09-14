package com.mogu.easy;

import com.mogu.util.ArrayUtils;

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
        int i,j=0;
        int len=nums.length;
        for(i=0; i<len; i++)
        {
        	if(nums[i]!=nums[j])
        	{
        		j++;
        		nums[j]=nums[i];
        	}
        }
        return j+1;
    }
}