package sliding_window;
/*
        brute force :> O(n^2)
 */
public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        int n = array.length;
        System.out.println(maxSumSubarrayOfSizeK(array, k, n));
    }
    private static int maxSumSubarrayOfSizeK(int[] array, int k, int n) {
        int maxsum = Integer.MIN_VALUE;
        for (int i=0; i<=n-3; i++) {
            int contiguousSum = 0;
            for (int j=i; j<=i+2; j++) {
                contiguousSum += array[j];
            }
            maxsum = Math.max(contiguousSum, maxsum);
        }
        return maxsum;
    }
}
