// Majority Element (Using Moore’s Voting Algorithm)

package problem1.arrays;

public class Problem1Arrays {

    public static void main(String[] args) {
        int[] a = {2, 2, 3, 2, 2, 1, 1};

        int size = a.length;
        printMajority(a, size);
    }

    static void printMajority(int a[], int size) {

        int cand = findCandidate(a, size);
        System.out.println(cand);
        if (isMajority(a, size, cand)) {
            System.out.println("Majority Element : " + cand);
        } else {
            System.out.println("No Majority Element");
        }
    }

    static int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    static boolean isMajority(int a[], int size, int cand) {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == cand) {
                count++;
            }
        }
        if (count > size / 2) {
            return true;
        } else {
            return false;
        }
    }
}
