class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long cnt = 0;
        long sum = 0;
        int c = 0;
        int j = 0;
        for (int i = 0;i<n;i++){
            sum += nums[i];
            c++;
            while (sum*c>=k){
                sum -= nums[j];
                c = c-1;
                j++;
            }
            cnt += c;
        }
        return cnt;
    }
}