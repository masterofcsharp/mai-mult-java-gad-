package Greedy;

import java.util.Arrays;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
       if (nums.length == 1) return nums[0];

       int sum = 0;
       int max = Integer.MIN_VALUE;

       for (int n : nums) {
           sum +=n;
           max = Math.max(max, sum);
           if (sum < 0) {
               sum = 0;
           }
       }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

}
