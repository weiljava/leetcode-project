package com.mogu.util;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/11
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ArrayUtils {

    public static void printArray(int[] arrays) {
        System.out.print("打印数组开始：");
        if (arrays != null && arrays.length > 0) {
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[i]);
                if (i < arrays.length - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println("");
    }
}