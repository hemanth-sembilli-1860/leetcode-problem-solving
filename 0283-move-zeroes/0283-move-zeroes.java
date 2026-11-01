class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return;
        }
        int zeros = 0;
        for (int i = 0;i<n;i++){
            if (nums[i]==0){
                zeros++;
            }
        }
        int j = 0;
        for (int i = 0;i<n;i++){
            if (nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        int z = n-1;
        while (zeros>0){
            nums[z] = 0;
            z--;
            zeros--;
        }
    }
}