class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int n = nums.length;
        double avg = Double.NEGATIVE_INFINITY;
        for (int right = 0;right<n;right++){
            sum += nums[right];
            while (right-left+1 == k){
                avg = Math.max(avg,(double)sum/k);
                sum -= nums[left];
                left++;
            }
        }
        return avg;
    }
}