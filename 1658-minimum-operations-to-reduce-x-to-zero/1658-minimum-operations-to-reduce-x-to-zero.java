class Solution {
    public int minOperations(int[] nums, int x) {
        int k = -x;
        int n = nums.length;
        for (int i:nums){
            k += i;
        }
        if (k<0){
            return -1;
        }
        int best = -1;
        int i = 0;
        int sum = 0;
        for (int j = 0;j<n;j++){
            sum += nums[j];
            while (sum>k){
                sum -= nums[i++];
            }
            if (sum == k){
                best = Math.max(best,j-i+1);
            }
        }
        return best<=-1?-1:n-best;
    }
}