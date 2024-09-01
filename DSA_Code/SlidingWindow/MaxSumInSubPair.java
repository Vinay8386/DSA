package SlidingWindow;

import java.util.*;

public class MaxSumInSubPair {
    public static void main(String[] args) {
        int[] arr={2,3,5,2,9,7,1};
        //pairHavingMaxSum(arr);
        Optional<int[]> result = maxTriplet(arr);
        result.ifPresent(ints -> System.out.println("Triplet with max sum: " + Arrays.toString(ints)));
    }

    public static Optional<int[]> maxTriplet(int[] arr) {

        if (arr.length < 3) {
            return Optional.empty();
        }

        // Initialize variables to store the maximum sum and the corresponding triplet
        int maxSum = Integer.MIN_VALUE;
        int[] maxTriplet = new int[3];

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                        maxTriplet[0] = arr[i];
                        maxTriplet[1] = arr[j];
                        maxTriplet[2] = arr[k];
                    }
                }
            }
        }
        return Optional.of(maxTriplet);
    }
}
