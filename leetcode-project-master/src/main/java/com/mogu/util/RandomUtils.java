package com.mogu.util;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/11
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class RandomUtils {

    /**
     * @param length 长度
     * @param n      小于等于的数字
     * @return
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = new Random().nextInt(n);
        }
        return a;
    }
}