// Stock Buy Sell to Maximize Profit # 02

package problem4.arrays;

public class Problem4Arrays {

    public static void main(String[] args) {
        int[] a = {2, 7, 9, 1, 4, 2, 10};

        System.out.println("Maximam Profit : " + maxProfit(a));
    }

    static int maxProfit(int[] a) {
        int profit = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                profit += (a[i] - a[i - 1]);
                System.out.println(profit);
            }
        }
        return profit;
    }
}
