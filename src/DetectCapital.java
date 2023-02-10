/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 */
public class DetectCapital {
    public static void main(String[] args) {
        String word = "FlaG";
        DetectCapital detectCapital = new DetectCapital();
        System.out.println(detectCapital.detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        return count == 0 || count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
