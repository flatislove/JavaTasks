/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int pointerS = 0;
        int pointerT = 0;
        while (pointerS < s.length() && pointerT < t.length()) {
            if (t.charAt(pointerT) == s.charAt(pointerS)) {
                pointerS++;
            }
            pointerT++;
        }
        return pointerS >= s.length();
    }
}
