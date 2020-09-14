package Primary_algorithm.DeleteRepeat;

public class No_1_DeleteRepeat {
    /**
     * @param nums
     * @return
     * @describe 双指针判断是否存在
     */
    public int violence(int[] nums) {
        int head = 0;//头指针
        int tail = 1;//尾指针

        for (;tail<nums.length;tail++){
            //头尾指针相同时，移动尾指针
            if (nums[head] != nums[tail]){
                //若头尾指针不相同，则移动头指针
                head++;
                nums[head] = nums[tail];
            }
        }

        for (int a :
                nums) {
            System.out.print(a+",");
        }

        return head+1;//因为需要返回数组长度，所以将头指针的下标加一
    }

    public static void main(String[] args) {
        No_1_DeleteRepeat girl = new No_1_DeleteRepeat();
        int[] nums = {1, 2, 2, 4, 5, 5};
        girl.violence(nums);
    }
}
