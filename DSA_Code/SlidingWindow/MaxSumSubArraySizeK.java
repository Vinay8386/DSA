package SlidingWindow;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubArraySizeK {
    public static void main(String[] args) {

    }

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){

        long max_sum = Long.MIN_VALUE;
        long window_sum = 0;

        //Calculate a first window and assume it is max_sum
        for (int i = 0; i < K; i++) {
            window_sum+=Arr.get(i);
        }

        max_sum=window_sum;

        //slide the window, add next element, and subtract starting element to maintain window
        for (int i = K; i < Arr.size(); i++) {
            window_sum+=Arr.get(i)-Arr.get(i-K);
            max_sum=Math.max(max_sum,window_sum);
        }
        return max_sum;
    }
}

/*
Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
 */