/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * Return the maximum number of words that appear in a single sentence.
 */
public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        MaximumNumberOfWordsFoundInSentences max = new MaximumNumberOfWordsFoundInSentences();
        System.out.println(max.mostWordsFound(sentences));
    }

    public int mostWordsFound(String[] sentences) {
        byte count = 0;
        for (String sentence : sentences) {
            byte tmp = 0;
            int subLngt = sentence.length();
            for (int i = 0; i < subLngt; i++) {
                if (sentence.charAt(i)==' ') {
                    tmp++;
                }
            }
            if (tmp > count) {
                count = tmp;
            }
        }
        return ++count;
    }
}
