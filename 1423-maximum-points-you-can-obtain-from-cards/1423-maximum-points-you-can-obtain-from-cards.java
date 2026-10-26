class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for (int i = 0;i<k;i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;
        int rightSum = 0;
        for (int i = 0;i<k;i++){
            sum -= cardPoints[k-i-1];
            rightSum += cardPoints[n-i-1];
            maxSum = Math.max(maxSum,sum+rightSum);
        }
        return maxSum;
    }
}