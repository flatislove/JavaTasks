/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * Each word consists of lowercase and uppercase English letters.
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the
 * words in the sentence.
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 */
public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        SortingTheSentence sortingTheSentence = new SortingTheSentence();
        System.out.println(sortingTheSentence.sortSentence(s));
    }

    public String sortSentence(String s) {
        String[] strings = s.split(" ");
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < strings.length - 1; i++) {
                char lastOne = strings[i].charAt(strings[i].length() - 1);
                char lastTwo = strings[i + 1].charAt(strings[i + 1].length() - 1);
                if (lastOne > lastTwo) {
                    isSorted = false;
                    String tmp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string, 0, string.length() - 1);
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
