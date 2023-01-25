/**
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        System.out.println(numberOfGoodPairs.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        int lngt = nums.length;
        int pairs = 0;
        for (int i = 0; i < lngt; i++) {
            for (int j = i + 1; j < lngt; j++) {
                if (nums[i]==nums[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
