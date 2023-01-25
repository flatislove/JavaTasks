import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        System.out.println(Arrays.toString(runningSumOf1dArray.runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int lngt = nums.length;
        int prev = 0;
        for (int i = 0; i < lngt; i++) {
            nums[i] = prev + nums[i];
            prev = nums[i];
        }
        return nums;
    }
}
