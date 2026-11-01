class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int c = 0;
        int max = nums[0];
        for (int i:nums){
            max = Math.max(max,i);
        }
        for (int i = 0;i<n;i++){
            if (nums[i]<max){
                c += (max-nums[i]);
            }
        }
        return c;
    }
}