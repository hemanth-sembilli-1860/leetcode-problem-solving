class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int c = 0;
        int max = nums[0];
        for (int i:nums){
            max = Math.max(max,i);
        }
        for (int i = 0;i<n;i++){
            while (nums[i]!=max){
                c++;
                nums[i] += 1;
            }
        }
        return c;
    }
}