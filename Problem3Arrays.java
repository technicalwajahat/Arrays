// Stock Buy Sell to Maximize Profit # 01

package problem3.arrays;

public class Problem3Arrays {

    public static void main(String[] args) {
        int[] a = {3, 2, 6, 4, 10};

        System.out.println("Maximum Profit : " + maxProfit(a));
    }

    static int maxProfit(int[] a) {
        int max = 0;
        int min = a[0];
        int profit = 0;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            profit = a[i] - min;
            max = Math.max(max, profit);
        }
        return max;
    }
}
