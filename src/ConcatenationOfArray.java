import java.util.Arrays;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
 * and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays. Return the array ans.
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 6};
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        System.out.println(Arrays.toString(concatenationOfArray.getConcatenation(nums)));
    }

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length * 2];
        for (int i = 0; i < length; i++) {
            arr[i] = nums[i];
            arr[length + i] = nums[i];
        }
        return arr;
    }
}
