class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i :nums){
            min = Math.min(min,i);
        }
        int c = 0;
        for (int i = 0;i<n;i++){
            if (nums[i]!=min){
                c += (nums[i]-min);
            }
            else {
                continue;
            }
        }
        return c;
    }
}