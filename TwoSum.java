// https://leetcode.com/problems/two-sum/

class TwoSum {
    public int maxProfitBruteForce(int[] prices) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++) {
            int c = prices[i];
            for (int j=i+1; j<prices.length; j++) {
                int d = prices[j];
                if (maxProfit<d-c) {
                    maxProfit = d-c;
                }
            }

        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int  p : prices) {
            min = Math.min(min, p);
            max = Math.max(max, p-min);
        }
        return max;
    }


    public int maxProfitOptimum(int[] prices) {
        int maxProfit = 0, left = 0, right = 1;
        if (prices.length == 0) return 0;

        while (right<prices.length) {
            int diff = prices[right] - prices[left];
            if (diff<0) {
                left = right;
            }
            else   {
                 maxProfit = Math.max(diff,maxProfit);
                
            }
            right++;
            
        } 
        return maxProfit;
    }
}

/**

input
- arr of prices, stock price on ith day

condition, output
- max profit 


 */
