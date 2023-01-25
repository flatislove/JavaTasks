/**
 * Given two integers num1 and num2, return the sum of the two integers.
 */
public class AddTwoIntegers {
    public static void main(String[] args) {
        int num1 = -10;
        int num2 = 5;
        AddTwoIntegers addTwoIntegers = new AddTwoIntegers();
        System.out.println(addTwoIntegers.sum(num1, num2));
    }

    public int sum(int num1, int num2) {
        return (char) num1 + (char) num2;
    }
}
