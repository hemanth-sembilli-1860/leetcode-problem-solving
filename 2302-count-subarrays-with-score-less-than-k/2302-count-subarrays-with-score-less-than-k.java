class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int l = 0;
        long c = 0;
        long sum = 0;
        while (i<n){
             sum += nums[i];
             l++;
            while (sum*l>=k){
                sum -= nums[j];
                l--;
                j++;
            }
            c += i-j+1;
            i++;
        }
        return c;
    }
}







/*
int count = 0;
        for (int i = 0;i<n;i++){
            int s = 0;
            int c = 0;
            for (int j = i;j<n;j++){
                s += nums[j];
                c++;
                if (s*c<k){
                count++;
            }
            }
        }
        return count;
*/