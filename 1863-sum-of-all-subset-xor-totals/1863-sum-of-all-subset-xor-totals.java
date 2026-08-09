class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    private int backtrack(int nums[],int pos,int xor){
        int n = nums.length;
        int sum = xor;
        for (int i = pos;i<n;i++){
            sum += backtrack(nums,i+1,xor^nums[i]);
        }
        return sum;
    }
}