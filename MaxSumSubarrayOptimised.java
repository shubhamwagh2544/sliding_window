package sliding_window;

import java.util.Scanner;

public class MaxSumSubarrayOptimised {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 2, 9, 1};
        int n = array.length;
        int k = new Scanner(System.in).nextInt();
        if (k > 0 && k <= n) {
            System.out.println(maxSumSubarrayOptimised(array, n, k));
        }
        else {
            System.out.println("wrong input");
        }
    }


    private static int maxSumSubarrayOptimised(int[] array, int n, int k) {
        int contiguousSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < n) {
            contiguousSum += array[j];
            if (j-i+1 == k) {
                maxsum = Math.max(contiguousSum, maxsum);
                contiguousSum = contiguousSum - array[i];
                i++;
            }
            j++;
        }
        return maxsum;
    }
}
