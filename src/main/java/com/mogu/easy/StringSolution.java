package com.mogu.easy;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/15
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class StringSolution {

    /**
     * 反转字符串
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhbqj/
     *
     * @param s
     */
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    /**
     * 整数反转
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnx13t/
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        LinkedList<Long> stack = new LinkedList<>();
        while (x != 0) {
            long num = x % 10;
            x = x / 10;
            stack.add(num);
        }
        long i = 1l;
        long rev = 0l;
        while (stack.size() > 0) {
            rev = rev + stack.removeLast() * i;
            if (rev > Integer.MAX_VALUE) {
                return 0;
            } else if (rev < Integer.MIN_VALUE) {
                return 0;
            }
            i = i * 10;
        }
        return (int) rev;
    }

    /**
     * 字符串中的第一个唯一字符
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn5z8r/
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 实现String.indexOf方法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[0]) {
                int j = 0;
                int k = i;
                while (j < chars2.length) {
                    if (chars2[j] == chars1[k]) {
                        j++;
                        k++;
                    }
                }
                if (j == chars2.length) {
                    return i;
                }
            }
        }

        return -1;
    }
}