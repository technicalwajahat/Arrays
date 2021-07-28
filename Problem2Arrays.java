// Largest Sum Contiguous Subarray (Kadane’s Algorithm)

package problem2.arrays;

public class Problem2Arrays {

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("Maximum Contiguous Sum : " + maxSubArraySum(a));
        System.out.println("");
    }

    static int maxSubArraySum(int a[]) {
        int curr_Sum = 0, max_Sum = 0;
        int start_index = 0, end_index = 0, s = 0;

        for (int i = 0; i < a.length; i++) {

            curr_Sum = curr_Sum + a[i];

            if (curr_Sum > max_Sum) {
                max_Sum = curr_Sum;
                start_index = s;
                end_index = i;
            }
            if (curr_Sum < 0) {
                curr_Sum = 0;
                s = i + 1;
            }
        }
        System.out.println("Start Index : " + start_index);
        System.out.println("End Index : " + end_index);
        return max_Sum;
    }
}
