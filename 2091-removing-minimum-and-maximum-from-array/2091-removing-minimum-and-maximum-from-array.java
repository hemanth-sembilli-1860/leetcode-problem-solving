class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd = 0;
        int maxInd = 0;
        if (n == 1){
            return 1;
        }
        for (int i = 0;i<n;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        for (int i = 0;i<n;i++){
            if (nums[i] == min){
                minInd = i;
            }
            if (nums[i] == max){
                maxInd = i;
            }
        }
        int front = Math.max(minInd, maxInd) + 1;
        int back = n - Math.min(minInd, maxInd);
        int frontback = Math.min(minInd, maxInd) + 1 + n - Math.max(minInd, maxInd);
        return Math.min(Math.min(front, back), frontback);
    }
}