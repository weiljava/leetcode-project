package util;

import java.util.Map;

public class MyUtil {

    public void sortIntArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void showIntArray(int[] nums1) {
        for (int a : nums1)
            System.out.print(a + ",");
    }

    public void showMap(Map map) {
        for (Object key : map.keySet()) {
            System.out.print("Key = " + key + "value = " + map.get(key));
        }
    }
}
