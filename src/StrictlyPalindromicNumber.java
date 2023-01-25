import java.util.ArrayList;
import java.util.Objects;

/**
 * An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation
 * of the integer n in base b is palindromic.
 * Given an integer n, return true if n is strictly palindromic and false otherwise.
 * A string is palindromic if it reads the same forward and backward.
 */
public class StrictlyPalindromicNumber {
    public static void main(String[] args) {
        int n = 9;
        StrictlyPalindromicNumber strictlyPalindromicNumber = new StrictlyPalindromicNumber();
        System.out.println(strictlyPalindromicNumber.isStrictlyPalindromic(n));
    }

    public boolean isStrictlyPalindromic(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n - 2; i++) {
            int tmpN = n;
            while (tmpN > 0) {
                list.add(tmpN % i);
                tmpN /= i;
            }
            int lngt = list.size() / 2 + 1;
            for (int j = 0; j < lngt; j++) {
                if (!Objects.equals(list.get(j), list.get(list.size() - j - 1))) {
                    return false;
                }
            }
            list.clear();
        }
        return true;
    }
}
