class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        long sum = 0;
        long max = 0;
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for (int i = 1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],nums[i]);
        }
        for (int i = n-2;i>=0;i--){
            suffix[i] = Math.max(suffix[i+1],nums[i]);
        }
        for (int j = 1;j<n-1;j++){
            sum = (long)(prefix[j-1]-nums[j])*suffix[j+1];
            max = Math.max(max,sum);
        }
        return max;
    }
}