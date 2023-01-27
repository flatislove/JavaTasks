/**
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled
 * such that the character at the ith position moves to indices[i] in the shuffled string.
 * Return the shuffled string.
 */
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        ShuffleString shuffleString = new ShuffleString();
        System.out.println(shuffleString.restoreString(s, indices));
    }

    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
