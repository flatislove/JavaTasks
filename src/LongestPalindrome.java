/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome
 * that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome(s));
    }

    public int longestPalindrome(String s) {
        int[] charCount = new int[128];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        int len = 0;
        for (int count : charCount) {
            len += count / 2 * 2;
            if (len % 2 == 0 && count % 2 == 1) {
                len++;
            }
        }
        return len;
    }
}
