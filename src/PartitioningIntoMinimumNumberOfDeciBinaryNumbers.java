/**
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example,
 * 101 and 1100 are deci-binary, while 112 and 3001 are not. Given a string n that represents a positive decimal integer,
 * return the minimum number of positive deci-binary numbers needed so that they sum up to n.
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        String n = "27346209830709182346";
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers part = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        System.out.println(part.minPartitions(n));
    }

    public int minPartitions(String n) {
        int lngt = n.length();
        int count = 0;
        for (int i = 0; i < lngt; i++) {
            int current = Character.getNumericValue(n.charAt(i));
            if (current > count) {
                count = current;
            }
        }
        return count;
    }
}
