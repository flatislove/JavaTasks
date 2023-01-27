/**
 * You are given a positive integer num consisting of exactly four digits. Split num into two new integers
 * new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the
 * digits found in num must be used.
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible
 * pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 * Return the minimum possible sum of new1 and new2.
 */
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        int num = 2932;
        MinimumSumOfFourDigitNumberAfterSplittingDigits min = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
        System.out.println(min.minimumSum(num));
    }

    public int minimumSum(int num) {
        byte[] arr = {(byte) (num % 10), (byte) ((num / 10) % 10), (byte) ((num / 100) % 10), (byte) ((num / 1000) % 10)};
        for (byte i = 0; i < 2; i++) {
            for (byte j = 0; j < 3 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    byte tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]);
    }
}
