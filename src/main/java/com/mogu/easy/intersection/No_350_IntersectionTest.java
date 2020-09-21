import org.apache.commons.lang.math.RandomUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.MyUtil;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_350_IntersectionTest {

    private No_350_Intersection girl;
    private long startTime;
    private long endTime;

    @BeforeEach
    //执行前守卫
    void foxBefore(){
        girl = new No_350_Intersection();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    //执行后守卫
    void foxAfter(){
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void doSomeThing() {
        int[] nums1 = {5, 1, 4,22,1,22};
        int[] nums2 = {4, 1, 22,66,3,4,4};
        //排序
        MyUtil util = new MyUtil();
        util.sortIntArray(nums1);
        util.sortIntArray(nums2);
        //打印数组
//        System.out.println("排序后：");
//        System.out.print("数组一：");util.showIntArray(nums1);
//        System.out.print("数组二：");util.showIntArray(nums2);

        //去重
        No_350_Intersection girl = new No_350_Intersection();
        int[] newNums1 = girl.repeat(nums1);
        int[] newNums2 = girl.repeat(nums2);
//        System.out.println();
//        System.out.println("去重后：");
//        System.out.print("数组一：");util.showIntArray(newNums1);
//        System.out.print("数组二：");util.showIntArray(newNums2);

        //合并
        int[] sumNumber = girl.insert(newNums1,newNums2);
//        System.out.println("合并后：");
//        util.showIntArray(sumNumber);
        util.sortIntArray(sumNumber);
        int[] newSumNumber = girl.same(sumNumber);
        util.showIntArray(newSumNumber);


    }
}