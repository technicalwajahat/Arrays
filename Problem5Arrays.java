// Rainwater Trapping Problem

package problem5.arrays;

public class Problem5Arrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 7, 4, 3, 9, 8};

        System.out.println("Maximum water that can be accumulated : " + RainwaterTrapping(a));
    }

    static int RainwaterTrapping(int[] a) {

        int size = a.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int water = 0;

        left[0] = a[0];
        for (int i = 1; i < size; i++) {
            left[i] = Math.max(left[i - 1], a[i]);
        }

        right[size - 1] = a[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], a[i]);
        }

        for (int i = 0; i < size; i++) {
            water += Math.min(left[i], right[i]) - a[i];
        }

        return water;
    }
}
