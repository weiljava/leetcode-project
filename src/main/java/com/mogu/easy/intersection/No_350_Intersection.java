import java.util.HashMap;
import java.util.Map;

/**
 * @author Tkning·Json
 * @program: matchForSelf in pg_excel
 * @date 2020-09-16 17:35:11
 * @description 传入两个数组，计算这两个数组的集合
 */
public class No_350_Intersection {
    public Map repeatMap = new HashMap();
    public Map noRepeatMap = new HashMap();
    int sameNumber;

    /**
     * @param nums1(int[]),numbs2(int[]) —— 需要做交集的两个数组（已排序）
     * @return
     * @createDate 2020/9/17 10:43
     * @describe 传入两个已排好序的两个数组，对两个数组进行重复检测
     * 若在当前数组中无重复数据，则将两个数组合并，选取合并后的相同数据
     * 若在当前数组中存在重复数据，则先去除重复数据，再合并。
     */
    public int[] insert(int[] nums1, int[] nums2) {
        int numsSize1 = nums1.length;
        int numsSize2 = nums2.length;

        //合并数组到数组sunNums
        int[] sunNums = new int[numsSize1 + numsSize2];
        for (int i = 0; i < numsSize1; i++) {
            sunNums[i] = nums1[i];
        }
        for (int i = 0; i < numsSize2; i++) {
            sunNums[i + numsSize1] = nums2[i];
        }

        return sunNums;
    }

    /**
     * 去重
     * @param nums —— 已排好序的数组
     * @return repeatMap —— 相同数据的map
     * @createDate 2020/9/17 10:51
     * @describe
     */
    public int[] repeat(int[] nums) {
        int head = 0;
        int tail = 1;
        for (; tail < nums.length; tail++) {
            if (nums[tail] != nums[head]) {
                head++;
                nums[head] = nums[tail];
            }
        }
        int size = head + 1;
        int[] newNums = new int[size];
        for (int i = 0; i < size; i++) {
            newNums[i] = nums[i];
        }
        return newNums;
    }

    /**
     * 寻找相同数
     */
    public int[] same(int[] nums) {
        int head = 0;
        int index = 0;
        int[] newNums = new int[nums.length];

        for (; head < nums.length; head++) {
            for (int tail = head + 1; tail < nums.length; tail++) {
                if(nums[head] == nums[tail]){
                    newNums[index] = nums[head];
                    index++;
                }
            }
        }
        return newNums;
    }
}
