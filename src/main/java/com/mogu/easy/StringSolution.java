package com.mogu.easy;

public class StringSolution {


    /**
     * 查询字符串中是否包含数字
     *
     * @param s
     * @return
     */
    public boolean main(String s) {
        char[] dst = s.toCharArray();
        for (char c : dst) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }


    /**
     * 题目：给你一个混合字符串 s ，请你返回 s 中 第二大 的数字，如果不存在第二大的数字，请你返回 -1 。
     * 混合字符串 由小写英文字母和数字组成。
     * https://leetcode-cn.com/problems/second-largest-digit-in-a-string/solution/1796-zi-fu-chuan-zhong-di-er-da-de-shu-z-tk2n/
     *
     * @param s
     * @return
     */
    public int secondHighest(String s) {
        boolean[] exist = new boolean[10];
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char cur = cs[i];
            if (cur >= '0' && cur <= '9') {
                exist[cur - '0'] = true;
            }
        }
        int cnt = 0;
        for (int i = 9; i >= 0; i--) {
            if (exist[i]) {
                cnt++;
            }
            if (cnt == 2) {
                return i;
            }
        }
        return -1;
    }


}
