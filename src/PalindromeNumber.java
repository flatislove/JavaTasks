import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < digits.size() / 2 + 1; i++) {
            if (!Objects.equals(digits.get(i), digits.get(digits.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }


}