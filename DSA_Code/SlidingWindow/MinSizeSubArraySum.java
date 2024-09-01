package SlidingWindow;

//Leetcode: 209. Minimum Size Subarray Sum
public class MinSizeSubArraySum {
    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {
        int left=0, right=0, win_sum=0, min_length=Integer.MAX_VALUE;

        while(right<nums.length){
            win_sum+=nums[right];

            while(win_sum>=target){
                min_length=Math.min(min_length,right-left+1);
                win_sum-=nums[left];
                left++;
            }

            right++;
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}

/*
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */