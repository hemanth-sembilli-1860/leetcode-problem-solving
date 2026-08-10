class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int odd = 1;
        for (int even = 0;even<n;even = even+2){
            if (nums[even]%2!=0){
                while (nums[odd]%2 != 0){
                    odd += 2;
                }
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        return nums;
    }
}