/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
    }

    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int counter = s.length();
        int posChar = 0;
        int idxWord = 1;
        while (idxWord < strs.length) {
            while (posChar < strs[idxWord].length() && posChar < counter) {
                if (strs[idxWord].charAt(posChar)==s.charAt(posChar)) {
                    posChar++;
                } else {
                    break;
                }
            }
            if (counter > posChar) {
                counter = posChar;
            }
            posChar = 0;
            idxWord++;
        }
        return s.substring(0, counter);
    }
}
