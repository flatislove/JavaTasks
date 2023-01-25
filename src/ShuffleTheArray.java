import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(nums, n)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        for (int i = 0; i < n; i++) {
            res[i * 2] = nums[i];
            res[(i * 2) + 1] = nums[i + n];
        }
        return res;
    }
}
