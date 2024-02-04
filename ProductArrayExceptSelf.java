/**
https://leetcode.com/problems/product-of-array-except-self/
-- input
arr[]

-- output
arr[] st ans[i] = product of all nums except num[i]

-- condition
product guaranteed as 32 bit int
algo O(n)

 */
class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]resArr = new int[n];
        int []suff = new int[n];
        int []pref = new int[n];
        suff[n-1] = 1;
        pref[0] = 1;
        for (int i=1; i<n; i++) {
            pref[i] = pref[i-1]*nums[i-1];
        }

        for (int j=n-2; j>=0; j--) {
            suff[j] = suff[j+1]*nums[j+1];
        }

        for (int i=0; i<n; i++) {
            resArr[i] = pref[i]*suff[i];
        }

        return resArr;

    }
}
