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
     * 思路;将相同的数据移动到最后,因为是按小到大,当前面的大于后面的时候结束
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        if (nums.length > 0) {
            //防止数据全部一致死循环
            if (nums[0] == nums[nums.length - 1]) {
                return 1;
            }
            for (i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    System.out.println("i=" + i + ",j=" + j + "=======");
                    //数据一致将数据移动到最后
                    if (nums[i] == nums[j]) {
                        int temp = nums[j];
                        for (int k = j + 1; k < nums.length; k++) {
                            nums[k - 1] = nums[k];
                        }
                        nums[nums.length - 1] = temp;
                        //抵消掉移动到最后一位的影响
                        j--;
                    } else if (nums[i] > nums[j]) {
                        return i + 1;
                    } else {
                        break;
                    }
                    ArrayUtils.printArray(nums);
                }
            }
            ArrayUtils.printArray(nums);
        } else {
            return -1;
        }
        return i + 1;
    }


}