package com.mogu.easy;

import com.mogu.util.ArrayUtils;

/**
 * User: zuofan
 * Date: 2020/9/14
 * Time: 14:05
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
            //获取最大数
            int max = nums[nums.length - 1];
            for (i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    System.out.println("i=" + i + ",j=" + j + "=======");
                    //数据一致将数据移动到最后
                    if (nums[i] < max) {
                        if (nums[i] == nums[j]) {
                            int temp = nums[j];
                            for (int k = j + 1; k < nums.length; k++) {
                                nums[k - 1] = nums[k];
                            }
                            nums[nums.length - 1] = temp;
                            //抵消掉移动到最后一位的影响
                            j--;
                        } else {
                            break;
                        }
                    } else {
                        return i + 1;
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

    /**
     * 获取2个数组的交集
     * 思路;循环比对，加标记
     *
     * @param nums1,nums2
     * @return
     */
    public int[] arrayIntersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        //标记数组
        int[] indexs = new int[nums2.length];
        //结果数组长度
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && indexs[j] == 0) {
                    indexs[j] = -1;
                    index++;
                    break;
                }
            }
        }
        int[] result = new int[index];
        int index1 = 0;
        for (int i = 0; i < indexs.length; i++) {
            if (indexs[i] == -1) {
                result[index1] = nums2[i];
                index1++;
            }
        }
        return result;
    }


    //数组加1
    public int[] arrayAddOne(int[] nums1) {
        //判断舒服+1位
        boolean isOut = true;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 9) {
                isOut = false;
                break;
            }
        }
        if (isOut) {
            int[] result = new int[nums1.length + 1];
            result[0] = 1;
            return result;
        } else {
            int[] result = new int[nums1.length];
            //判断是否继续+1
            boolean hasAdd = true;
            for (int i = nums1.length - 1; i > -1; i--) {
                if (hasAdd) {
                    if (nums1[i] == 9) {
                        result[i] = 0;
                    } else {
                        result[i] = nums1[i] + 1;
                        hasAdd = false;
                    }
                } else {
                    result[i] = nums1[i];
                }

            }
            return result;
        }

    }
}