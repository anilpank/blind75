/**
https://leetcode.com/problems/maximum-product-subarray/

--input
arr[nums]

--output
subarray with largest product
return product



 */
class MaxProductSubArray {
    public int maxProduct(int[] nums) {
       int max = 1;
       int min = 1;
       int res = nums[0];

       for (int num : nums) {
           res = Math.max(num, res);
       }

       for (int n: nums) {
           int temp = max;
           max = maximum(max*n, min*n, n);
           min = minimum(temp*n, min*n, n);
           res = Math.max(max, res);
       }
       return res;
    }

    private int maximum(int a, int b, int c) {
        int max = Math.max(a,b);
        max = Math.max(max, c);
        return max;
    }

    private int minimum(int a, int b, int c) {
        int min = Math.min(a,b);
        min = Math.min(min, c);
        return min;
    }
}
