import java.util.Arrays;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number
 * of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        KidsWithTheGreatestNumberOfCandies kids = new KidsWithTheGreatestNumberOfCandies();
        System.out.println(kids.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int lngt = candies.length;
        Boolean[] booleans = new Boolean[lngt];
        for (int i = 0; i < lngt; i++) {
            booleans[i] = true;
            for (int j = 0; j < lngt; j++) {
                if (candies[i] + extraCandies < candies[j] && i!=j) {
                    booleans[i] = false;
                    break;
                }
            }
        }
        return Arrays.asList(booleans);
    }
}
