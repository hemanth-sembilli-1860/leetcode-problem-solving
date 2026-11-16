class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }
        int size = nums.length;
        while (size>1){
            int st = 0;
            int end = size-1;
            while (st<end){
                nums[st] = (nums[st]+nums[st+1])%10;
                st++;
            }
        size--;
        }
        return nums[0];
    }
}