 /**
 https://leetcode.com/problems/maximum-subarray/
    --input
    arr[nums]

    --output
    sum of subarray

    --condition
    subarray with largest sum
     */
class MaxSubArraySum {
   

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i=0; i<nums.length; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum<0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
