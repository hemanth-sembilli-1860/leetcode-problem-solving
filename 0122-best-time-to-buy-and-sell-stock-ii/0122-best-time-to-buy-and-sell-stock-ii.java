class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<n-1;i++){
            if (prices[i]<prices[i+1]){
                sum += (prices[i+1]-prices[i]);
            }
        }
        return sum;
    }
}