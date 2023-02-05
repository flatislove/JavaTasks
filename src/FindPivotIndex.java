/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum
 * of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        int pointer = 0;
        while (pointer < nums.length - 1 && leftSum != rightSum) {
            leftSum += nums[pointer];
            rightSum -= nums[pointer + 1];
            pointer++;
        }
        return leftSum == rightSum ? pointer : -1;
    }
}
