/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has
 * in the jth bank. Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        System.out.println(richestCustomerWealth.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int cols = accounts[0].length;
        int wealth = 0;
        for (int[] account : accounts) {
            int tmpWealth = 0;
            for (int j = 0; j < cols; j++) {
                tmpWealth += account[j];
            }
            if (tmpWealth > wealth) {
                wealth = tmpWealth;
            }
        }
        return wealth;
    }
}
