/**
 * There is a programming language with only four operations and one variable X:
 *     ++X and X++ increments the value of the variable X by 1.
 *     --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] strings = {"--X", "X++", "X++"};
        FinalValueOfVariableAfterPerformingOperations fv = new FinalValueOfVariableAfterPerformingOperations();
        System.out.println(fv.finalValueAfterOperations(strings));
    }

    public int finalValueAfterOperations(String[] operations) {
        byte value = 0;
        for (String operation : operations) {
            switch (operation) {
                case "X++", "++X" -> value++;
                case "X--", "--X" -> value--;
            }
        }
        return value;
    }
}
