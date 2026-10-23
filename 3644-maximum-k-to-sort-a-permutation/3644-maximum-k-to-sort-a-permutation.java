class Solution {
    public int sortPermutation(int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0;i<n;i++){
            if (nums[i] == i) {
                continue;
            }
            res &= nums[i];
        }
        if (res == Integer.MAX_VALUE){
            return 0;
        }
        else {
            return res;
        }
    }
}