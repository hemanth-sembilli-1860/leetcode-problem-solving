class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return subArray(nums,k)-subArray(nums,k-1);
    }
    public int subArray(int nums[],int k){
        int n = nums.length;
        int left = 0;
        int count = 0;
        int oddCount = 0;
        for (int right = 0;right<n;right++){
            if (nums[right]%2!=0){
                oddCount++;
            }
            while (oddCount>k){
                if (nums[left]%2!=0){
                    oddCount--;
                }
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
}