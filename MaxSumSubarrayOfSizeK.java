package sliding_window;

import java.util.Scanner;

/*
        brute force :> O(n^2)
 */
public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 2, 9, 1};
        int k = new Scanner(System.in).nextInt();
        int n = array.length-1;
        System.out.println(maxSumSubarrayOfSizeK(array, k, n));
    }
    private static int maxSumSubarrayOfSizeK(int[] array, int k, int n) {
        int maxsum = Integer.MIN_VALUE;
        for (int i=0; i<=n-k; i++) {
            int contiguousSum = 0;
            for (int j=i; j<i+k; j++) {
                contiguousSum += array[j];
            }
            maxsum = Math.max(contiguousSum, maxsum);
        }
        return maxsum;
    }
}
